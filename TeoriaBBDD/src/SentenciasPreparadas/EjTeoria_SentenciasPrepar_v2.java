
package sentenciaspreparadas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EjTeoria_SentenciasPrepar_v2 {
  public static void main(String[] args) {
    try{
      Class.forName("com.mysql.jdbc.Driver");
      String url="jdbc:mysql://localhost/Colegio";      
      String user="root";
      String password="";
      Connection con=DriverManager.getConnection(url, user, password);
      //SE MUESTRA QUE PUEDE HABER DISTINTAS SENTENCIAS PREPARADAS
      //QUE HAGAN LO MISMO PERO CON DISTINTO FORMATO
      String cadena="insert into Alumnos values(?,?,?,?)";
      PreparedStatement ps1=con.prepareStatement(cadena);
      cadena="insert into Alumnos(id,nombre,apellido) values(?)";
      PreparedStatement ps4=con.prepareStatement(cadena);
      cadena="update Alumnos set nota=nota+? where id=?";
      PreparedStatement ps2=con.prepareStatement(cadena);
      cadena="update Alumnos set nota=? where id=?";
      PreparedStatement ps5=con.prepareStatement(cadena);
      cadena="delete from Alumnos where id=?";
      PreparedStatement ps3=con.prepareStatement(cadena); 
      cadena="delete from Alumnos where nota<?";
      PreparedStatement ps6=con.prepareStatement(cadena); 
      
      Statement st=con.createStatement();
      ResultSet rs=st.executeQuery("select * from alumnos");
      
      System.out.println("---- ANTES DE LA ACTUALZACION ----");
      
      while(rs.next()){
       System.out.println(rs.getInt(1)+" "+rs.getString(2)+
                         " "+rs.getString(3)+" "+rs.getInt(4));
      }
      
      rs=st.executeQuery("select * from cambios");
      
      //DANDO DE ALTA A LOS ALUMNOS QUE NO EXISTEN
      
      while(rs.next()){
        if(rs.getString(2).equals("BJ")) {
          ps3.setInt(1, rs.getInt(3));
          if(ps3.executeUpdate()==0)
            DarAlta(ps1,rs.getInt(3));
          else System.out.println("SE HA DADO DE BAJA AL ALUMNO "+rs.getInt(3));
        } else{
           ps2.setInt(1, rs.getInt(4));
           ps2.setInt(2, rs.getInt(3));
           if(ps2.executeUpdate()==0)
            DarAlta(ps1,rs.getInt(3));  
           else System.out.println("SE HA MODIFICADO AL ALUMNO "+rs.getInt(3));
        }
     }
      
     rs=st.executeQuery("select * from alumnos");
      
     System.out.println("---- DESPUES DE LA ACTUALIZACION ----");
      
     while(rs.next()){
       System.out.println(rs.getInt(1)+" "+rs.getString(2)+
                         " "+rs.getString(3)+" "+rs.getInt(4));
      } 
      
     rs=st.executeQuery("select * from alumnos where nota>10");
     
     while(rs.next()){
         ps5.setInt(1,10);
         ps5.setInt(2,rs.getInt(1));
         ps5.executeUpdate();
     }
     
     rs=st.executeQuery("select * from alumnos");
      
     System.out.println("---- DESPUES DE LA 2ª ACTUALIZACION ----");
      
     while(rs.next()){
       System.out.println(rs.getInt(1)+" "+rs.getString(2)+
                         " "+rs.getString(3)+" "+rs.getInt(4));
      }
     
      ps1.close();
      ps2.close();
      ps3.close();
      ps4.close();
      ps5.close();
      st.close();
      con.close();
            
    }catch(ClassNotFoundException ex){
      System.out.println(ex);
    }catch(SQLException ex){
      System.out.println(ex);  
    }
    }
  static void DarAlta(PreparedStatement ps,int mat) throws SQLException{
     Scanner teclado=new Scanner(System.in);
     String nombre,apellido,resp;
     int nota;
     System.out.println("Quiere dar de alta al alumno(si/no)");
     resp=teclado.next();
     if(resp.equalsIgnoreCase("si")){
        teclado.nextLine();
        System.out.println("Introducir nombre");
        nombre=teclado.nextLine();
        System.out.println("Introducir apellido");
        apellido=teclado.nextLine();
        System.out.println("Introducir nota");
        nota=teclado.nextInt();
        ps.setInt(1, mat);
        ps.setString(2, nombre);
        ps.setString(3, apellido);
        ps.setInt(4, nota);
        ps.executeUpdate();
     }else System.out.println("No se va a dar de alta");
  }
}