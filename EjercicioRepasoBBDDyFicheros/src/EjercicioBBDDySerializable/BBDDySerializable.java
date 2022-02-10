
package EjercicioBBDDySerializable;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class BBDDySerializable {
  public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
    try{
      File f=new File("productos.dat");
      File f1=new File("ventas.txt");
      Producto p;
      ArrayList<Producto> lista=new ArrayList<Producto>();
      Class.forName("com.mysql.jdbc.Driver");  
      String url="jdbc:mysql://localhost/Almacen";
      String user="root";
      String password="";
      Connection con=DriverManager.getConnection(url, user, password);
      Statement st=con.createStatement();
      String cadena="update productos set stock=stock-? where codproducto=?";
      PreparedStatement ps=con.prepareStatement(cadena);
      ResultSet rs;
      cadena="select codproducto,sum(unidadesvendidas) from ventas "
      +"group by codproducto";
      rs=st.executeQuery(cadena);
      
      while(rs.next()){
      ps.setInt(1,rs.getInt(2));
      ps.setString(2,rs.getString(1));
      ps.executeUpdate();
      }
      FileOutputStream fos=new FileOutputStream(f);
      ObjectOutputStream oos=new ObjectOutputStream(fos);
      
      rs=st.executeQuery("select * from productos");
      while(rs.next()){
      p=new Producto(Integer.parseInt(rs.getString(1)),rs.getString(2),rs.getInt(4),rs.getInt(5));
      oos.writeObject(p);
      }
      oos.close();
      fos.close();
      
      FileInputStream fis=new FileInputStream(f);
      ObjectInputStream ois=new ObjectInputStream(fis);
      try{
        while(true){
          p=(Producto)ois.readObject();
          lista.add(p);
        // System.out.println(p.toString());
        }
      }catch(EOFException ex){}
      
      ois.close();
      fis.close();
      
      for(int i=0;i<lista.size();i++)
       System.out.println(lista.get(i).toString());
      
      Ventas(lista,teclado,f1);
            
      System.out.println("ANTES DE ACTUALIZAR LA TABLA PRODUCTOS");
            
      rs=st.executeQuery("select * from productos");
            
      while(rs.next()){
        System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5)); 
      }
            
      Actualizar(lista,st);
      
      System.out.println("DESPUES DE ACTUALIZAR LA TABLA PRODUCTOS");
            
      rs=st.executeQuery("select * from productos");
            
      while(rs.next()){
        System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5)); 
      }
      
      
      MostrarVentas(f1);
      
      ps.close();
      st.close();
      con.close();
    }catch(IOException ex){
      System.out.println(ex);
    }catch(ClassNotFoundException ex){
      System.out.println(ex);  
    }catch(SQLException ex){
      System.out.println(ex);
    }
  
  }
  
  static void Ventas(ArrayList<Producto> lista,Scanner t,File f1){
      try{
        FileWriter fw=new FileWriter(f1);
        BufferedWriter bw=new BufferedWriter(fw);
        String resp,cadena;
        int cantidad,pos,cod;
        System.out.println("Quiere comprar productos?(Si/No)");
        resp=t.next();
        while(resp.equalsIgnoreCase("Si")){
           MostarProductos(lista);
           do{
             System.out.println("Introduce el codigo del producto a comprar");
             cod=t.nextInt();
           }while(cod<1 || cod>9);
           System.out.println("Introduce cantidad del producto a comprar");
           cantidad=t.nextInt();  
           if(cantidad>0 && lista.get(cod-1).Venta(cantidad)){
            cadena="Producto Comprado: "+lista.get(cod-1).getNombre()
                  +" Cantidad Comprada: "+cantidad
                  +" Precio Total: "+cantidad*lista.get(cod-1).getPrecio();  
            bw.write(cadena);
            bw.newLine();
          }else System.out.println("No puede comprar esa cantidad del "
                  + "producto pues no hay suficiente stock");
           
          System.out.println("Quiere comprar productos?(Si/No)");
          resp=t.next();
        }
        bw.close();
        fw.close();
    }catch(IOException ex){
      System.out.println(ex);
  }
  }  
    static void MostarProductos(ArrayList<Producto> lista){
        System.out.println("PRODUCTOS A VENDER");
        for(int i=0;i<lista.size();i++)
            if(lista.get(i).getCantidad()>0)
             System.out.println(lista.get(i).toString());
    } 
    
    static void Actualizar(ArrayList<Producto> lista,Statement s) {
     try{
        for(int i=0;i<lista.size();i++) {
           String cadena="update productos set stock="+lista.get(i).getCantidad()
                          +" where codproducto='"+lista.get(i).getCodigo()+"'";
           s.executeUpdate(cadena);
       }
        
    }catch(SQLException ex){
      System.out.println(ex);
    }
  } 
  static void MostrarVentas(File f1){
    try{
      FileReader fr=new FileReader(f1);
      BufferedReader br=new BufferedReader(fr);
      String cadena=br.readLine();
      while(cadena!=null){
       System.out.println(cadena);  
       cadena=br.readLine();
      }
      br.close();
      fr.close();
    }catch(IOException ex){
        System.out.println(ex);
    }
  }  
}
