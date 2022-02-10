
package Ejercicios2_BBDD.Ej2_Almacen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej2_Almacen {
    public static void main(String[] args) throws SQLException {
        try{
            Scanner teclado = new Scanner(System.in);
            ArrayList<Producto> lista=new ArrayList<Producto>();
            Producto p;
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost/Almacen";
            String user="root";
            String password="";
            Connection con=DriverManager.getConnection(url, user, password);
            Statement st=con.createStatement();
            Statement st1=con.createStatement();
            
            String cadena="select codproducto,sum(unidadesvendidas) from ventas "
                    + "group by codproducto";
            
            ResultSet rs = st.executeQuery(cadena);
            while(rs.next()){
              cadena="update productos set stock=stock-"+rs.getInt(2)
                      +" where codproducto='"+rs.getString(1)+"'";
              st1.executeUpdate(cadena);
            }
            rs=st.executeQuery("select * from productos");
            
            while(rs.next()){
               p=new Producto(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5)); 
               lista.add(p);
            }
            
            Ventas(lista,teclado);
            
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
            
             
            st.close();
            st1.close();
            con.close();
        }catch(ClassNotFoundException ex){
            System.out.println(ex);
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
    static void Ventas(ArrayList<Producto> lista,Scanner t){
        String resp,cod;
        int cantidad,pos;
        System.out.println("Quiere comprar productos?(Si/No)");
        resp=t.next();
        while(resp.equalsIgnoreCase("Si")){
           MostarProductos(lista);
           do{
             System.out.println("Introduce el codigo del producto a comprar");
             cod=t.next();
           }while(Integer.parseInt(cod)<1 || Integer.parseInt(cod)>9);
           System.out.println("Introduce cantidad del producto a comprar");
           cantidad=t.nextInt();  
           if(cantidad>0 && cantidad<=lista.get(Integer.parseInt(cod)-1).getStock()){
              System.out.println("Producto Comprado: "+lista.get(Integer.parseInt(cod)-1).getNombre()
                  +" Cantidad Comprada: "+cantidad
                  +" Precio Total: "+cantidad*lista.get(Integer.parseInt(cod)-1).getPrecio());  
               lista.get(Integer.parseInt(cod)-1).setStock(lista.get(Integer.parseInt(cod)-1).getStock()-cantidad);
          }else System.out.println("No puede comprar esa cantidad del producto");
           
          System.out.println("Quiere comprar productos?(Si/No)");
          resp=t.next();
        }
    }
    
    static void MostarProductos(ArrayList<Producto> lista){
        System.out.println("PRODUCTOS A VENDER");
        for(int i=0;i<lista.size();i++)
            if(lista.get(i).getStock()>0)
             System.out.println(lista.get(i).toString());
    } 
    
    static void Actualizar(ArrayList<Producto> lista,Statement s) throws SQLException{
       for(int i=0;i<lista.size();i++) {
           String cadena="update productos set stock="+lista.get(i).getStock()
                          +" where codproducto='"+lista.get(i).getCodP()+"'";
           s.executeUpdate(cadena);
       }
        
    }
    
}

    
    

