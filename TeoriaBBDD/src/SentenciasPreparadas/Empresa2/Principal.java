
package SentenciasPreparadas.Empresa2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
   Scanner teclado = new Scanner(System.in);
   try{
     Class.forName("com.mysql.jdbc.Driver");
     String url="jdbc:mysql://localhost/Empresa";
     String user="root";
     String password="";
     Connection con=DriverManager.getConnection(url, user, password);
     
     String cadena="insert into Departamentos values(?,?,?)";
     PreparedStatement ps1=con.prepareStatement(cadena);
     cadena="select * from Empleados where emp_no=?";
     PreparedStatement ps2=con.prepareStatement(cadena);
     cadena="delete from Departamentos where dept_no=?";
     PreparedStatement ps3=con.prepareStatement(cadena);
     cadena="update Empleados set dept_no=0 where dept_no=?";
     PreparedStatement ps4=con.prepareStatement(cadena);
     cadena="update Empleados set salario=salario+? where dept_no=?";
     PreparedStatement ps5=con.prepareStatement(cadena);
     cadena="select * from departamentos,empleados "
           +"where departamentos.dept_no=empleados.dept_no";
     PreparedStatement ps6=con.prepareStatement(cadena);
     cadena="select max(dept_no) from departamentos";
     PreparedStatement ps7=con.prepareStatement(cadena);
     
     int opc=Menu(teclado);
     while(opc!=6){
       switch(opc){
           case 1:Insertar(ps1,teclado,ps7);
                 break;
           case 2:System.out.println("Introducir numero de empleado");
                  int num=teclado.nextInt();
                  MostrarEmpleado(ps2,num);
                 break;
           case 3:System.out.println("Introducir numero de departamento");
                  num=teclado.nextInt();
                  EliminarDepartamento(ps3,ps4,num);
                  break;
           case 4:System.out.println("Introducir numero de departamento");
                  num=teclado.nextInt();
                  System.out.println("Introducir cantidad a incrementar");
                  int cant=teclado.nextInt();
                  SubirSueldo(ps5,num,cant);
                  break;
           case 5: MostrarTodos(ps6);
                   break;
           default:System.out.println("Operacion incorrecta");
                   break;
       }  
       opc=Menu(teclado);  
     }
     con.close();
   }catch(ClassNotFoundException ex){
       System.out.println(ex);
   }catch(SQLException ex){
      System.out.println(ex);  
   } 
     
 }
  static int Menu(Scanner t){
      int op=0;
      System.out.println("1.Insertar departamento");
      System.out.println("2.Mostar datos de un empleado");
      System.out.println("3.Eliminar departamento");
      System.out.println("4.Actualizar salario");
      System.out.println("5.Mostar la informacion de todos los empleados");
      System.out.println("6.Salir");
      System.out.println("Escoger opcion:");
      op=t.nextInt();
      return op;
  }
  
  static void Insertar(PreparedStatement ps,Scanner t,PreparedStatement ps1) throws SQLException{
      ResultSet rs=ps1.executeQuery();
      rs.next();
      int codigo=rs.getInt(1)+10;
      t.nextLine();
      System.out.println("Introducir nombre del departamento");
      String nombre=t.nextLine();
      System.out.println("Introducir localidad del departamento");
      String loc=t.nextLine();
      ps.setInt(1, codigo);
      ps.setString(2, nombre);
      ps.setString(3, loc);
      ps.executeUpdate();
  }
  
  static void MostrarEmpleado(PreparedStatement ps,int emp) throws SQLException{
     ps.setInt(1, emp);
     ResultSet rs=ps.executeQuery();
     if(rs.next())
       System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble("salario"));
     else System.out.println("NO EXISTE ESE EMPLEADO"); 
  }
  
  static void EliminarDepartamento(PreparedStatement ps,PreparedStatement ps1,int dep) throws SQLException{
      ps1.setInt(1, dep);
      ps1.executeUpdate();
      ps.setInt(1, dep);
      if(ps.executeUpdate()==0)
        System.out.println("El departamento no existe");
      else
        System.out.println("Departamento eliminado satisfactoriamente");
  }
  static void SubirSueldo(PreparedStatement ps,int dep,int c) throws SQLException{
     ps.setInt(1,c);
     ps.setInt(2, dep);
     if(ps.executeUpdate()==0)
       System.out.println("El departamento no existe");  
     else
       System.out.println("Salario actualizado");
  }
  
  static void MostrarTodos(PreparedStatement ps) throws SQLException{
     ResultSet rs=ps.executeQuery();
     while(rs.next()){
      System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)
      +" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getInt(7)
      +" "+rs.getString(8)+" "+rs.getInt(9)+" "+rs.getInt(10));
     }
  }

    
}
