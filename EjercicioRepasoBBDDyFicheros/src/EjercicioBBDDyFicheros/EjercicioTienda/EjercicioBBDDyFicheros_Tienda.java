/*
SERIALIZACION
Hacer una aplicación para que realice las siguientes operaciones:
•Serializar todos los objetos de tipo producto en un fichero llamado “productos.dat”.
Dichos datos se sacaran de la tabla Artículos, de la base de datos Tienda.
•Se recuperarán todos los productos del fichero “productos.dat” y se asignarán a un arraylistde productos.
•Se le presentarán al usuario todos los productos que sean susceptibles de ser vendidos, es decir, 
    aquellos que en cantidad sea > 0.
•Cuando se venda un producto se ira guardando en un fichero de texto con los datos del producto 
    vendido así como la cantidad y el importe total.
*/

package EjercicioBBDDyFicheros.EjercicioTienda;

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

public class EjercicioBBDDyFicheros_Tienda {
 public static void main(String[] args) {
  try{
    Class.forName("com.mysql.jdbc.Driver");    
    String url="jdbc:mysql://localhost/Tienda";
    String user="root";
    String password="";
    
    Connection con=DriverManager.getConnection(url, user, password);
    Statement st=con.createStatement();

    String cadena="delete from Productos where codproducto=?";
    PreparedStatement ps1=con.prepareStatement(cadena);
    cadena="insert into Productos values(?,?,?,?,?)";
    PreparedStatement ps2=con.prepareStatement(cadena);
    cadena="update Productos set preciounitario=preciounitario+preciounitario*?/100 "
            + "where codproducto=?";
    PreparedStatement ps3=con.prepareStatement(cadena);
    cadena="select * from productos where codproducto=?";
    PreparedStatement ps4=con.prepareStatement(cadena);
       
    ResultSet rs,rs1;
    
    File f=new File("datos2.dat");
    FileInputStream fis=new FileInputStream(f);
    DataInputStream dis=new DataInputStream(fis);
    
    String operacion,cp,nom,lp;
    int pu,stk,p;
    
    try{
      while(true){
        operacion=dis.readUTF();
        if(operacion.equalsIgnoreCase("B")){
          cp=dis.readUTF();
          ps1.setString(1,cp);
          if(ps1.executeUpdate()==0)
           System.out.println("El producto a borrar no existe"); 
          else System.out.println("Producto eliminado");
        }else if(operacion.equalsIgnoreCase("A")){
            cp=dis.readUTF();
            nom=dis.readUTF();
            lp=dis.readUTF();
            pu=dis.readInt();
            stk=dis.readInt();
            ps4.setString(1, cp);
            rs=ps4.executeQuery();
            if(rs.next())
            System.out.println("No se puede dar de alta pues ya existe ese producto");
            else{
              ps2.setString(1, cp);
              ps2.setString(2, nom);
              ps2.setString(3, lp);
              ps2.setInt(4, pu);
              ps2.setInt(5, stk);
              ps2.executeUpdate();
           }
        }else{
          cp=dis.readUTF(); 
          p=dis.readInt();
          ps3.setInt(1, p);
          ps3.setString(2, cp);
          if(ps3.executeUpdate()==0)
           System.out.println("No se puede actualizar el producto pues no existe");  
          else System.out.println("Precio actualizado");
        }
     }  
    }catch(EOFException ex){
        System.out.println("YA NO QUEDAN DATOS EN EL FICHERO");
    }
    
    dis.close();
    fis.close();
    
    cadena="select codproducto,sum(unidadesvendidas) from ventas "
            + "group by codproducto";
    rs=st.executeQuery(cadena);
    System.out.println("Nº Producto---Nombre Producto---Total Venta");
    while(rs.next()){
      ps4.setString(1,rs.getString(1));  
      rs1=ps4.executeQuery();
      if(rs1.next())
       System.out.println(rs1.getString(1)+"  "+rs1.getString(2)
               +"  "+rs.getInt(2)*rs1.getInt(4)); 
      else System.out.println("Ese producto no existe");
          
    }
    
    //OTRA FORMA DE HACER LA CONSULTA PARA EL INFORME
    System.out.println("-------------------------------");
    cadena="select ventas.codproducto,nombre,preciounitario*sum(unidadesvendidas) from ventas, productos "+
         "where ventas.codproducto=productos.codproducto group by ventas.codproducto";   
    rs=st.executeQuery(cadena);
    System.out.println("Nº Producto---Nombre Producto---Total Venta");
    while(rs.next()){
      System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));
    }
    
    ps1.close();
    ps2.close();
    ps3.close();
    ps4.close();
    con.close();
    
    
   }catch(ClassNotFoundException ex){
     System.out.println(ex);
   }catch(SQLException ex){
     System.out.println(ex);  
   }catch(IOException ex){
     System.out.println(ex);  
   }
 }
}

