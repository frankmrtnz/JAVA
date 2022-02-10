
package EjercicioRepasoBBDDyFicheros;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio2y3 {
   public static void main(String[] args) {
     try{
       //EJERCICIO 2
       Class.forName("com.mysql.jdbc.Driver");  
       String url="jdbc:mysql://localhost/Relaciones";
       String user="root";
       String password="";
       Connection con=DriverManager.getConnection(url, user, password);
       File f=new File("datos.bin");
       FileInputStream fis=new FileInputStream(f);
       DataInputStream dis=new DataInputStream(fis);
       Statement st=con.createStatement();
       st.executeUpdate("delete from emparejamientos");
       
       String cadena="insert into Emparejamientos values(?,?,?)";
       PreparedStatement ps1=con.prepareStatement(cadena);
       cadena="select * from mujeres where codigo=?";
       PreparedStatement ps2=con.prepareStatement(cadena);
       cadena="select * from hombres where codigo=?";
       PreparedStatement ps3=con.prepareStatement(cadena);
       ResultSet rsm,rsh,rs;
       
       
      System.out.println("TABLAS INICIALES"); 
      System.out.println("--- TABLA HOMBRES----");
      rs=st.executeQuery("select * from hombres");
      while(rs.next()){
       System.out.print(rs.getInt(1)+" "+rs.getString(2)+" ");
       for(int i=3;i<=7;i++)
        System.out.print(rs.getDouble(i)+" ");
       System.out.println();
      }
      
      System.out.println("--- TABLA MUJERES----");
      rs=st.executeQuery("select * from mujeres");
      while(rs.next()){
       System.out.print(rs.getInt(1)+" "+rs.getString(2)+" ");
       for(int i=3;i<=7;i++)
        System.out.print(rs.getDouble(i)+" ");
       System.out.println();
      }
       
      System.out.println("COMIENZA LA APLICACION");  
               
       int codh,codm;
       double afin=0,suma,raiz,m,h;
       try{
         while(true){
           suma=0;
           raiz=0;
           m=0;
           h=0;
           codm=dis.readInt();
           codh=dis.readInt();
           ps2.setInt(1, codm);
           rsm=ps2.executeQuery();
           if(rsm.next()){
             ps3.setInt(1, codh);
             rsh=ps3.executeQuery();
             if(rsh.next()){
              for(int i=3;i<=7;i++){ 
                suma=suma+rsh.getDouble(i)*rsm.getDouble(i);
                m=m+rsm.getDouble(i)*rsm.getDouble(i);
                h=h+rsh.getDouble(i)*rsh.getDouble(i);
                raiz=Math.sqrt(h*m);
              } 
              afin=suma/raiz;
              ps1.setInt(1, codh);
              ps1.setInt(2, codm);
              ps1.setDouble(3,afin);
              ps1.executeUpdate();
             }else System.out.println("No se puede hacer pues no existe el codigo "+codh+" en la BBDD");
           }else System.out.println("No se puede hacer pues no existe el codigo "+codm+" en la BBDD");
        }  
       }catch(EOFException ex){}
       
       dis.close();
       fis.close();
       
       cadena="delete from mujeres where codigo=?";
       PreparedStatement ps4=con.prepareStatement(cadena);
       cadena="delete from hombres where codigo=?";
       PreparedStatement ps5=con.prepareStatement(cadena);
       cadena="delete from emparejamientos where codigoH=? and codigoM=?";
       PreparedStatement ps6=con.prepareStatement(cadena);
       cadena="update Mujeres set v1=?,v2=?,v3=?,v4=?,v5=? where codigo=?";
       PreparedStatement ps7=con.prepareStatement(cadena);
       cadena="update Hombres set v1=?,v2=?,v3=?,v4=?,v5=? where codigo=?";
       PreparedStatement ps8=con.prepareStatement(cadena);
       double[] vm=new double[5];
       double[] vh=new double[5];
       rs=st.executeQuery("select * from emparejamientos");
       while(rs.next()){
         if(rs.getDouble(3)>=0.8){
           ps4.setInt(1, rs.getInt(2));
           ps4.executeUpdate();
           ps5.setInt(1, rs.getInt(1));
           ps5.executeUpdate();
         }else if(rs.getDouble(3)>=0.5){
           ps6.setInt(1, rs.getInt(1));
           ps6.setInt(2, rs.getInt(2));
           ps6.executeUpdate();
         }else{
           ps6.setInt(1, rs.getInt(1));
           ps6.setInt(2, rs.getInt(2));
           ps6.executeUpdate();
           ps2.setInt(1, rs.getInt(2));
           rsm=ps2.executeQuery();
           ps3.setInt(1, rs.getInt(1));
           rsm.next();
           rsh=ps3.executeQuery();
           rsh.next();
           for(int i=3;i<=7;i++){ 
             if((rsh.getDouble(i)+0.1)>1)
               vh[i-3]=1;
             else
               vh[i-3]=rsh.getDouble(i)+0.1;
             if((rsm.getDouble(i)+0.1)>1)
               vm[i-3]=1;
             else
               vm[i-3]=rsm.getDouble(i)+0.1;
           }
           for(int i=0;i<vm.length;i++){
             ps7.setDouble(i+1, vm[i]);
             ps8.setDouble(i+1, vh[i]);
           }
           ps7.setInt(6, rs.getInt(2));
           ps8.setInt(6, rs.getInt(1));
           ps7.executeUpdate();
           ps8.executeUpdate();
         }   
       }
      System.out.println("TABLAS ACTUALIZADAS"); 
      System.out.println("--- TABLA HOMBRES----");
      rs=st.executeQuery("select * from hombres");
      while(rs.next()){
       System.out.print(rs.getInt(1)+" "+rs.getString(2)+" ");
       for(int i=3;i<=7;i++)
        System.out.print(rs.getDouble(i)+" ");
       System.out.println();
      }
      
      System.out.println("--- TABLA MUJERES----");
      rs=st.executeQuery("select * from mujeres");
      while(rs.next()){
       System.out.print(rs.getInt(1)+" "+rs.getString(2)+" ");
       for(int i=3;i<=7;i++)
        System.out.print(rs.getDouble(i)+" ");
       System.out.println();
      }
      
      System.out.println("--- TABLA EMPAREJAMIENTOS----");
      rs=st.executeQuery("select * from emparejamientos");
      while(rs.next())
       System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getDouble(3));
       
      //EJERCICIO 3
      
      f=new File("afinidad.txt");
      FileWriter fw=new FileWriter(f);
      BufferedWriter bw=new BufferedWriter(fw);
      
      cadena="select * from emparejamientos";
           
      rs=st.executeQuery(cadena);
      
      while(rs.next()){
        bw.write("Hombre"+rs.getInt(1)+" tiene con Mujer"+rs.getInt(2)
                +" un grado de afinidad de "+rs.getDouble(3));
        bw.newLine();
      }
      bw.close();
      fw.close();
      
      System.out.println("CONTENIDO FICHERO AFINIDAD.TXT");
      
      FileReader fr=new FileReader(f);
      BufferedReader br=new BufferedReader(fr);
      
      cadena=br.readLine();
      
      while(cadena!=null){
        System.out.println(cadena);
        cadena=br.readLine();  
      }
      
      br.close();
      fr.close();
      
      rs.close();
      st.close();
      ps8.close();
      ps7.close();
      ps6.close();
      ps5.close();
      ps4.close();
      ps3.close();
      ps2.close();
      ps1.close();
      con.close();
      
     } catch(IOException ex){
       System.out.println(ex);
     }catch(ClassNotFoundException ex){
       System.out.println(ex);  
     }catch(SQLException ex){
       System.out.println(ex);  
     }
   
   }
    
}
