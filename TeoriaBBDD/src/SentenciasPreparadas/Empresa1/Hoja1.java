package SentenciasPreparadas.Empresa1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Hoja1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    ArrayList<Departamento> lista=new ArrayList<Departamento>();
    Departamento d;
    try{
      //APARTADO A  
      Class.forName("com.mysql.jdbc.Driver");
      String url="jdbc:mysql://localhost/Empresa";
      String user="root";
      String password="";
      Connection con=DriverManager.getConnection(url, user, password);
      
      String cadena="insert into Departamentos values (?,?,?)";
      PreparedStatement ps1=con.prepareStatement(cadena);
      cadena="select * from departamentos where dept_no=?";
      PreparedStatement ps2=con.prepareStatement(cadena);
      cadena="update Departamentos set loc=? where dept_no=?";
      PreparedStatement ps3=con.prepareStatement(cadena);
      cadena="delete from Departamentos where dept_no=?";
      PreparedStatement ps4=con.prepareStatement(cadena);
      cadena="update Empleados set salario=salario+? where dept_no=?";
      PreparedStatement ps5=con.prepareStatement(cadena);
            
      //APARTADO B
      int dep;
      String nom,loc;
      System.out.println("-------APARTADO B--------");
      System.out.println("Introducir codigo del departamento");
      dep=teclado.nextInt();
      teclado.nextLine();
      System.out.println("Introducir nombre del departamento");
      nom=teclado.nextLine();
      System.out.println("Introducir localidad del departamento");
      loc=teclado.nextLine();
      ps2.setInt(1, dep);
      ResultSet rs=ps2.executeQuery();
      if(rs.next())
      System.out.println("NO SE PUEDE INSERTAR PUES YA EXISTE "
      + "ESE NUMERO DE DEPARTAMENTO");
      else InsertarDepartamento(ps1,dep,nom,loc);
      
      //Apartado C
      System.out.println("-------APARTADO C--------");
      System.out.println("Introducir codigo del departamento");
      dep=teclado.nextInt();
      teclado.nextLine();
      System.out.println("Introducir nombre del departamento");
      nom=teclado.nextLine();
      System.out.println("Introducir localidad del departamento");
      loc=teclado.nextLine();
      ps2.setInt(1, dep);
      rs=ps2.executeQuery();
      if(rs.next())
      System.out.println("NO SE PUEDE INSERTAR PUES YA EXISTE "
      + "ESE NUMERO DE DEPARTAMENTO");
      else{
      d=new Departamento(dep,nom,loc);
      InsertarDepartamento(ps1,d);
      }
      
      //APARTADO D
      System.out.println("-------APARTADO D--------");
      ListaDepartamentos(con,lista);
      
      //VAMOS A MOSTRAR LO QUE TENEMOS EN EL ARRAYLIST
      for(int i=0;i<lista.size();i++)
      System.out.println(lista.get(i).toString());
      
      //APARTADO E
      System.out.println("-------APARTADO E--------");
      System.out.println("Introducir codigo del departamento");
      dep=teclado.nextInt();
      d=DatosDepartamento(ps2,dep);
      if(d==null)
      System.out.println("NO EXISTE ESE DEPARTAMENTO");
      else System.out.println(d.toString());
      
      //APARTADO F
      System.out.println("-------APARTADO F--------");
      System.out.println("Introducir codigo del departamento");
      dep=teclado.nextInt();
      teclado.nextLine();
      System.out.println("Introducir nombre del departamento");
      nom=teclado.nextLine();
      System.out.println("Introducir localidad del departamento");
      loc=teclado.nextLine();
      d=new Departamento(dep,nom,loc);
      ActualizarDepartamento(ps3,d);
      
      //APARTADO G
      System.out.println("-------APARTADO G--------");
      System.out.println("Introducir codigo del departamento");
      dep=teclado.nextInt();
      BajaDepartamento(ps4,dep);
      
      //APARTADO H
      System.out.println("-------APARTADO H--------");
      System.out.println("Introducir codigo del departamento");
      dep=teclado.nextInt();
      System.out.println("Introducir localidad del departamento");
      loc=teclado.nextLine();
      ActualizarDepartamento(ps3,dep,loc);
      
      //APARTADO I ES IGUAL QUE EL APARTADO E
      
      //APARTADO J
      System.out.println("-------APARTADO J--------");
      System.out.println("Introducir codigo del departamento");
      dep=teclado.nextInt();
      System.out.println("Introducir cantidad a incrementar");
      int cant=teclado.nextInt();
      
      ActualizarSalario(ps5,dep,cant);
      
      ps1.close();
      ps2.close();
      con.close();
      
    }catch(ClassNotFoundException ex) {
          System.out.println(ex);
    }catch(SQLException ex){
        System.out.println(ex);
    }
    }
  
  static void InsertarDepartamento(PreparedStatement ps,int dep,String nom,String loc) throws SQLException{
      ps.setInt(1, dep);
      ps.setString(2, nom);
      ps.setString(3, loc);
      ps.executeUpdate();
  }
  
  static void InsertarDepartamento(PreparedStatement ps,Departamento d) throws SQLException{
      ps.setInt(1, d.getNdept());
      ps.setString(2, d.getNombre());
      ps.setString(3, d.getLoc());
      ps.executeUpdate();
  }
  
  static void ListaDepartamentos(Connection c,ArrayList<Departamento> lista) throws SQLException{
     Departamento d;
     Statement st=c.createStatement();
     ResultSet rs=st.executeQuery("select * from departamentos");
     while(rs.next()){
       d=new Departamento(rs.getInt(1),rs.getString(2),rs.getString(3));
       lista.add(d);
     }
  }
  
  static Departamento DatosDepartamento(PreparedStatement ps,int dep) throws SQLException{
      ps.setInt(1, dep);
      ResultSet rs=ps.executeQuery();
      if(rs.next()){
        Departamento d=new Departamento(rs.getInt(1),rs.getString(2),rs.getString(3)); 
        return d;
      }else
       return null;  
  }
  
  static void ActualizarDepartamento(PreparedStatement ps, Departamento d) throws SQLException{
    ps.setString(1, d.getLoc());
    ps.setInt(2, d.getNdept());
    if(ps.executeUpdate()==0)
     System.out.println("El departamento no se ha actualizado pues no existe ");
    else System.out.println("Departamento actualizado");
  }
  
  static void BajaDepartamento(PreparedStatement ps,int dep) throws SQLException{
    ps.setInt(1, dep); 
    if(ps.executeUpdate()==0)
     System.out.println("El departamento no se ha dado de baja pues no existe ");
    else System.out.println("Departamento borrado");
  }
  
  static void ActualizarDepartamento(PreparedStatement ps, int dep, String loc) throws SQLException{
    ps.setString(1, loc);
    ps.setInt(2, dep);
    if(ps.executeUpdate()==0)
     System.out.println("El departamento no se ha actualizado pues no existe ");
    else System.out.println("Departamento actualizado");
  }
  static void ActualizarSalario(PreparedStatement ps, int dep, int cant) throws SQLException{
    ps.setInt(1, cant);
    ps.setInt(2, dep);
    if(ps.executeUpdate()==0)
     System.out.println("El salario no se ha actualizado pues no existe ese departamento ");
    else System.out.println("Salario actualizado");
  }
}
