/*
Se tiene creado el fichero binario “ventas.dat”, compuesto por los siguientes campos: 
Nvendedor(String), Codprod (int)y Unidades(int) y la base de datos Comercio, compuesta de las tablas 
Productos y Ventas, que se creara al ejecutar script Comercio.sql. Se pide actualizar la tabla Ventas, 
mediante el fichero, teniendo en cuenta las siguientes premisas:
...
*/

package EjercicioBBDDyFicheros.Ejercicio1;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio1 {
    public static void main(String[] args)  {
      try{
         Class.forName("com.mysql.jdbc.Driver");
         String url="jdbc:mysql://localhost/Comercio";
         String user="root";
         String password="";
         Connection con=DriverManager.getConnection(url, user, password);
         Statement st=con.createStatement();
         String cadena="insert into Ventas values(?,?,?,?)";
         PreparedStatement ps1=con.prepareStatement(cadena);
         cadena="select vendido,ganancia from Ventas where codvend=? and codprod=?";
         PreparedStatement ps2=con.prepareStatement(cadena);
         cadena="update Ventas set vendido=?, ganancia=? where codvend=? and codprod=?";
         PreparedStatement ps3=con.prepareStatement(cadena);
         cadena="select precio from productos where codprod=?";
         PreparedStatement ps4=con.prepareStatement(cadena);
         ResultSet rs2,rs4;
         File f=new File("ventas.dat");
         FileInputStream fis=new FileInputStream(f);
         DataInputStream dis=new DataInputStream(fis);
         String nven;
         int codp,uni;
         double gan,precio;
         System.out.println("---ANTES DE ACTUALIZAR---");
         ResultSet rs=st.executeQuery("select * from ventas");
         while(rs.next()){
          System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+
                             rs.getInt(3)+" "+rs.getDouble(4));   
         }
         
         try{
           while(true){
            nven=dis.readUTF();
            codp=dis.readInt();
            uni=dis.readInt();
            System.out.println(nven+" "+codp+" "+uni);
            ps2.setString(1, nven);
            ps2.setInt(2, codp);
            rs2=ps2.executeQuery();
            ps4.setInt(1, codp);
            rs4=ps4.executeQuery();
            if(rs4.next()){
              precio=rs4.getDouble(1);
              if(rs2.next()){
                 System.out.println("VAMOS A ACTUALIZAR");
                 gan=precio*uni;
                 gan=gan+rs2.getDouble(2);
                 uni=uni+rs2.getInt(1);
                 ps3.setInt(1, uni);
                 ps3.setDouble(2, gan);
                 ps3.setString(3, nven);
                 ps3.setInt(4, codp);
                 ps3.executeUpdate();
               }else{
                 System.out.println("VAMOS A INSERTAR");
                 gan=precio*uni;
                 ps1.setString(1, nven);
                 ps1.setInt(2, codp);
                 ps1.setInt(3, uni);
                 ps1.setDouble(4,gan);
                 ps1.executeUpdate();
               }
            }else System.out.println("EL PRODUCTO NO EXISTE");
          }  
         }catch(EOFException ex){}
         
         
         System.out.println("---DESPUES DE ACTUALIZAR---");
         rs=st.executeQuery("select * from ventas");
         while(rs.next()){
          System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+
                             rs.getInt(3)+" "+rs.getDouble(4));   
         }
         
         dis.close();
         fis.close();
         ps1.close();
         ps2.close();
         ps3.close();
         ps4.close();
         st.close();
         con.close();
         
      } catch(IOException ex) {
        System.out.println(ex);
      }catch(ClassNotFoundException ex){
        System.out.println(ex); 
      }catch(SQLException ex){
        System.out.println(ex);    
      }
    }
   
}
