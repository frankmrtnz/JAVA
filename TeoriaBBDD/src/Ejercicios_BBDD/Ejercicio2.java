
package Ejercicios_BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio2 {
    public static void main(String[] args) throws SQLException {
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/america";
            String user = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            Statement st1 = con.createStatement();
            
            st.execute("drop table PersonasPaises");
            
            String cadena = "create table PersonasPaises("
                    + "id int primary key,"
                    + "nombre varchar(15),"
                    + "apellido varchar(15),"
                    + "edad int,"
                    + "nombrepais varchar(15),"
                    + "tamanio varchar(15)"
                    + ")";
            st.execute(cadena);
            
            
            cadena = "SELECT persona.id, persona.nombre, apellido, edad, pais.nombre, tamanio "
                    + "FROM persona, pais WHERE persona.pais=pais.id";
            ResultSet rs = st.executeQuery(cadena);
            
            while(rs.next()){
                cadena = "INSERT INTO PersonasPaises VALUES ("
                        +rs.getString(1)+",'"+rs.getString(2)+"','"
                        +rs.getString(3)+"',"+rs.getInt(4)+",'"
                        +rs.getString(5)+"','"+rs.getString(6)+"')";
                    
                System.out.println(cadena);
                st1.executeUpdate(cadena);
            }
            
            cadena = "UPDATE PersonasPaises SET edad=edad+1 WHERE nombrepais='Costa Rica'";
            st.executeUpdate(cadena);
            
            cadena = "SELECT * FROM PersonasPaises";
            rs = st.executeQuery(cadena);
            
            while(rs.next()) {
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "
                        +rs.getString(3)+" "+rs.getInt(4)+" "
                        +rs.getString(5)+" "+rs.getString(6));                
            }
            
            
            
            
            st.close();
            st1.close();
            con.close();
            
        }catch(ClassNotFoundException ex){
            System.out.println(ex);
        } catch(SQLException ex) {
            System.out.println(ex);
        }
        
        
               
        
        
    }
}
