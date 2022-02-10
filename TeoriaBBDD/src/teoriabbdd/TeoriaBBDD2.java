
package teoriabbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TeoriaBBDD2 {
    public static void main(String[] args) {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");     //Hacen la conexion con MYSQL            
            String url = "jdbc:mysql://localhost/instituto";   //Nos conectamos a la BD instituto
            String user = "root";
            String password = "";            
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            Statement st1 = con.createStatement();
            ResultSet rs = st.executeQuery("select * from alumnos");
                /*
                if(rs.next())
                    System.out.println("Si hay registro");
                else
                    System.out.println("No hay registro");
                */
            while(rs.next())
                System.out.println(rs.getString("Mat")+" "+rs.getString(2)+" "
                        +rs.getString(3)+" "+rs.getString(4));
            
            String cadena = "update alumnos set poblacion = 'CORUNA' where mat = '45665448K'";
            
            st1.executeUpdate(cadena);
            
            rs = st.executeQuery("select * from alumnos");
            
            System.out.println("-----------------------------");
            while(rs.next())
                System.out.println(rs.getString("Mat")+" "+rs.getString(2)+" "
                        +rs.getString(3)+" "+rs.getString(4));
            
            
            
            
            
            
            st.close();
            st1.close();
            con.close();

            
        }catch (ClassNotFoundException ex){
            System.out.println("Conector no arrancado o clase no existente");
        } catch (Exception e) {
                System.out.println(e);
        }
        
    }
}
