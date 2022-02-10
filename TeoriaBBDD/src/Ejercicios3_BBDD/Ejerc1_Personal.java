
package Ejercicios3_BBDD;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejerc1_Personal {
 public static void main(String[] args) {
    try{
      Class.forName("com.mysql.jdbc.Driver");  
      String url="jdbc:mysql://localhost/Personal";
      String user="root";
      String password="";
      Connection con=DriverManager.getConnection(url, user, password);
      Statement st=con.createStatement();
      Statement st1=con.createStatement();
      
       String cadena="create table OficinaEmpleados("
      + "NombreEmpleado varchar(25),"
      + "NombreDepartamento varchar(15),"
      + "salario int,"
      + "comision int,"
      + "primary key(NombreEmpleado,NombreDepartamento))";
      
      st.execute(cadena);
        
      cadena="select empleado.nombre,departamento.nombre,salario "
             +"from empleado,departamento where empleado.Dept_no=departamento.Dept_no";
     
      ResultSet rs=st.executeQuery(cadena);
      int comision;
      while(rs.next()){
         if(rs.getString(2).equals("CONTABILIDAD")) 
          comision=rs.getInt(3)*10/100;
         else if(rs.getString(2).equals("INVESTIGACION"))
               comision=rs.getInt(3)*20/100;
         else if(rs.getString(2).equals("VENTAS"))
               comision=rs.getInt(3)*5/100;
         else comision=rs.getInt(3)*15/100;
         
         cadena="insert into OficinaEmpleados values('"
                 +rs.getString(1)+"','"+rs.getString(2)+"',"
                 +rs.getInt(3)+","+comision+")";
          
          st1.executeUpdate(cadena);
      }
      
      System.out.println("-------ANTES DE LA ACTUALIZACION------");
      rs=st.executeQuery("select * from OficinaEmpleados");
      while(rs.next())
       System.out.println(rs.getString(1)+"---"+rs.getString(2)+"---"
                         +rs.getInt(3)+"---"+rs.getInt(4));
      
      cadena="update OficinaEmpleados set comision=comision*1.01 where comision<300";
      st1.executeUpdate(cadena);
     
      cadena="update OficinaEmpleados set comision=comision*1.005 where comision>=400 and comision<=600";
      st1.executeUpdate(cadena);
      
      System.out.println("-------DESPUES DE LA ACTUALIZACION------");
      rs=st.executeQuery("select * from OficinaEmpleados");
      while(rs.next())
       System.out.println(rs.getString(1)+"---"+rs.getString(2)+"---"
                         +rs.getInt(3)+"---"+rs.getInt(4));
      
      st1.close();
      st.close();
      con.close();
      
    } catch(ClassNotFoundException ex){
       System.out.println(ex);
    }catch(SQLException ex){
      System.out.println(ex);  
    }
 
    
   }
}
