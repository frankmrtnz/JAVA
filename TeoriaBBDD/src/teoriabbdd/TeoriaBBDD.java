
package teoriabbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TeoriaBBDD {
    public static void main(String[] args) {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");  //Esto siempre sera asi. 
                                                     //Importante lo de jdbc (escribir bien el conector)
            String url = "jdbc:mysql://localhost";   // Esto siempre sera igual
            String user = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            st.execute("use prueba");
            /*
            String instruccion = "create database prueba";
            st.execute(instruccion);  //"execute" para operaciones a nivel general.-A nivel de registro(insert,update) será "executeUpdate".- Y para JQuery "executeQuery"
            
            String instruccion = "create table tabla1("
                    + "campo1 int primary key,"
                    + "campo2 varchar(10),"
                    + "campo3 decimal(3,1)"
                    + ")";
            st.execute(instruccion);
            
            String instruccion = "insert into tabla1 values (1,'nombre1',4.5),"
                    + "(2,'nombre2',8.2),(3,'nombre3',6.0)";
            st.execute(instruccion);
            */
            ResultSet rs = st.executeQuery("select * from tabla1");
            
            //Mientras que haya datos -> rs.next()=true; Entonces:
            while(rs.next()) //Avanza a la primera posicion de la tabla, y luego a las siguientes. Si tiene datos la tabla avanzara, así sabemos si esta vacia tambien
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));  //Tiene que coincidir el num columna (1) con el tipo de dato que tiene esta.
            
            st.close();
            con.close();
            
        } catch (SQLException ex) {    
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("La clase no existe");
        } catch (Exception e) { 
            System.out.println(e);
        }
        
    } 
}
