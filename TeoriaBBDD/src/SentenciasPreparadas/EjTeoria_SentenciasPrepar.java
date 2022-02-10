package sentenciaspreparadas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EjTeoria_SentenciasPrepar {
  public static void main(String[] args) {
    try{
      Class.forName("com.mysql.jdbc.Driver");
      String url="jdbc:mysql://localhost/Colegio";      
      String user="root";
      String password="";
      Connection con=DriverManager.getConnection(url, user, password);
      
      String cadena="insert into Alumnos values(?,?,?,?)";
      PreparedStatement ps1=con.prepareStatement(cadena);
      cadena="update Alumnos set nota=nota+? where id=?";
      PreparedStatement ps2=con.prepareStatement(cadena);
      cadena="delete from Alumnos where id=?";
      PreparedStatement ps3=con.prepareStatement(cadena); 
      
      Statement st=con.createStatement();
      ResultSet rs=st.executeQuery("select * from alumnos");
      
      System.out.println("---- ANTES DE LA ACTUALZACION ----");
      
      while(rs.next()){
       System.out.println(rs.getInt(1)+" "+rs.getString(2)+
                         " "+rs.getString(3)+" "+rs.getInt(4));
      }
      
      rs=st.executeQuery("select * from cambios");
      
      //SIN DAR DE ALTA A LOS ALUMNOS QUE NO EXISTEN
      
      while(rs.next()){
        if(rs.getString(2).equals("BJ")) {
          ps3.setInt(1, rs.getInt(3));
          ps3.executeUpdate();
        } else{
           ps2.setInt(1, rs.getInt(4));
           ps2.setInt(2, rs.getInt(3));
           ps2.executeUpdate();
        }
     }
      
     rs=st.executeQuery("select * from alumnos");
      
     System.out.println("---- DESPUES DE LA ACTUALZACION ----");
      
     while(rs.next()){
       System.out.println(rs.getInt(1)+" "+rs.getString(2)+
                         " "+rs.getString(3)+" "+rs.getInt(4));
      } 
      
      ps1.close();
      ps2.close();
      ps3.close();
      st.close();
      con.close();
            
    }catch(ClassNotFoundException ex){
      System.out.println(ex);
    }catch(SQLException ex){
      System.out.println(ex);  
    }
    }
}
