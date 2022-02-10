
package Ejercicios2_BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ej1_Coches {
  public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in); 
      try{
        Class.forName("com.mysql.jdbc.Driver");  
        String url="jdbc:mysql://localhost";
        String user="root";
        String password="";
        
        Connection con=DriverManager.getConnection(url, user, password);
        Statement st=con.createStatement();
        st.execute("drop database DatosCoches");
        st.execute("create database DatosCoches");
        st.execute("use DatosCoches");
        
        String cadena="CREATE TABLE PROPIETARIOS("
                + "DNI VARCHAR(10) Primary Key,"
                + "Nombre VARCHAR(40),"
                + "Edad INTEGER)";
        st.execute(cadena);
        
        cadena="CREATE TABLE COCHES("
             + "Matricula VARCHAR(10) Primary Key,"
             + "Marca VARCHAR(20)," 
             + "Precio INTEGER,"
             + "DNI VARCHAR (10)," 
             + "FOREIGN KEY (DNI) References Propietarios(DNI))";
        st.execute(cadena);
        
        cadena="INSERT INTO Propietarios values('1A','Pepe',30),"
                + "('1B','Ana',40),('1C','Maria',50)";
        st.executeUpdate(cadena);
        
        cadena="INSERT INTO Coches values('MA-1111','Opel',1000,'1A'),"
             + "('MA-2222','Renault',2000,'1A'),('BA-3333', 'Seat', 3000,'1B')";
        st.executeUpdate(cadena);
        
        
        int operacion=Menu(teclado);
        while(operacion!=5){
           switch(operacion){
               case 1:Alta(con,teclado);
                      break;
               case 2:Mostrar(con,teclado);
                      break;
               case 3:InsertarCoche(con,teclado);
                       break;
               case 4: Borrar(con,teclado);
                       break;
               default:System.out.println("Operacion Incorrecta");
                       break;
           } 
           operacion=Menu(teclado);  
        }
        
    }catch(ClassNotFoundException ex){
         System.out.println(ex);
      }catch(SQLException ex){
         System.out.println(ex);  
      }
    }
  
  static int Menu(Scanner t){
      int opc;
      System.out.println("1.Dar de alta propietarios y sus respectivos coches");
      System.out.println("2.Mostrar todos los datos de un propietario por DNI");
      System.out.println("3.Insertar coches");
      System.out.println("4.Borrar propietario y sus coches");
      System.out.println("5.Salir");
      System.out.println("Escoger una opcion");
      opc=t.nextInt();
      return opc;
  }
  
  static void Alta(Connection c,Scanner t){
      try {
          String Dni,nombre,matricula,marca;
          int edad,precio;
          System.out.println("Introducir DNI del nuevo propietario");
          Dni=t.next();
          Statement st=c.createStatement();
          Statement st1=c.createStatement();
          String cadena="select * from propietarios where DNI='"+Dni+"'";
          ResultSet rs=st.executeQuery(cadena);
          if(rs.next())
           System.out.println("Ese DNI ya existe, no se puede dar de alta el propietario");
          else{
            System.out.println("Introducir nombre del nuevo propietario");
            nombre=t.next();  
            System.out.println("Introducir edad del nuevo propietario");
            edad=t.nextInt();
            cadena="INSERT INTO Propietarios values('"+Dni+"','"+nombre+"',"+edad+")";
            st1.executeUpdate(cadena);
            System.out.println("Introducir matricula del nuevo coche");
            matricula=t.next();
            cadena="select * from coches where Matricula='"+matricula+"'";
            rs=st.executeQuery(cadena);
            if(rs.next())
             System.out.println("Esa Matricula ya existe, no se puede dar de alta el coche");  
            else{
             System.out.println("Introducir la marca del nuevo coche");
             marca=t.next();  
             System.out.println("Introducir precio del nuevo coche");
             precio=t.nextInt(); 
             cadena="INSERT INTO Coches values('"+matricula+"','"+marca+"',"+precio+",'"+Dni+"')";
             st1.executeUpdate(cadena);
           }
          }
          
      } catch (SQLException ex) {
          System.out.println(ex);
      }
  }
  
  static void Mostrar(Connection c,Scanner t){
     try {
          String Dni;
          System.out.println("Introducir DNI del nuevo propietario");
          Dni=t.next();
          Statement st=c.createStatement();
          String cadena="select * from propietarios, coches "
                        +"where propietarios.dni=coches.dni and propietarios.dni='"+Dni+"'"; 
          ResultSet rs=st.executeQuery(cadena);
          
          if(rs.next()){
              System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+
                                 rs.getString(4)+" "+rs.getString(5)+rs.getInt(6));
              while(rs.next()){
                 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+
                                 rs.getString(4)+" "+rs.getString(5)+rs.getInt(6)); 
             }
          }else 
             System.out.println("Ese DNI no corresponde a ningun propietario");
      }catch(SQLException ex){
         System.out.println(ex);
     }
  }
  
  static void InsertarCoche(Connection c,Scanner t){
      try {
          String Dni,matricula,marca;
          int precio;
          System.out.println("Introducir DNI del propietario");
          Dni=t.next();
          Statement st=c.createStatement();
          Statement st1=c.createStatement();
          String cadena="select * from propietarios where DNI='"+Dni+"'";
          ResultSet rs=st.executeQuery(cadena);
          if(rs.next()){
            System.out.println("Introducir matricula del nuevo coche");
            matricula=t.next();
            cadena="select * from coches where Matricula='"+matricula+"'";
            rs=st.executeQuery(cadena);
            if(rs.next())
             System.out.println("Esa Matricula ya existe, no se puede dar de alta el coche");  
            else{
             System.out.println("Introducir la marca del nuevo coche");
             marca=t.next();  
             System.out.println("Introducir precio del nuevo coche");
             precio=t.nextInt(); 
             cadena="INSERT INTO Coches values('"+matricula+"','"+marca+"',"+precio+",'"+Dni+"')";
             st1.executeUpdate(cadena);
           }
          }else{
            System.out.println("Ese DNI no existe, no se puede dar de alta el coche");
          }
      }catch(SQLException ex){
         System.out.println(ex);
      }
  }
  
  static void Borrar(Connection c,Scanner t){
      try {
          String Dni,matricula;
          Statement st=c.createStatement();
          System.out.println("Introducir DNI del propietario");
          Dni=t.next();
          String cadena="delete from coches where dni='"+Dni+"'";
          if(st.executeUpdate(cadena)!=0)
            System.out.println("Coche(s) se han dado de baja");
          else
            System.out.println("No habia coches asociados a ese dni");
          cadena="delete from propietarios where dni='"+Dni+"'";
          if(st.executeUpdate(cadena)==1)
            System.out.println("Propietario dado de baja");
          else
            System.out.println("Esa dni no existe en el sistema");
          
      }catch(SQLException ex){
         System.out.println(ex);
      }
  }
}
