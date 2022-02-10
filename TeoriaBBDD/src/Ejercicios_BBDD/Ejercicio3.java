
package Ejercicios_BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/tienda";
            String user = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            Statement st1 = con.createStatement();
            
            st.execute("drop table ArtFab");
            
            String cadena = "CREATE TABLE ArtFab("
                    + "NombreAr varchar(30),"
                    + "NombreFab varchar(30),"
                    + "precio int,"
                    + "iva int,"
                    + "primary key (nombrear,nombrefab)"
                    + ")";
            
            st.execute(cadena);
            
            cadena = "SELECT articulos.nombre, fabricantes.nombre, precio "
                    + "FROM articulos, fabricantes "
                    + "WHERE articulos.clfab=fabricantes.clfab";
            
            ResultSet rs = st.executeQuery(cadena);
            
            int iva, precio;
            
            while(rs.next()){
                precio = rs.getInt(3);
                if(precio<200)
                    iva = precio*10/100;
                else if(precio<500)
                    iva = precio*8/100;
                else if(precio<700)
                    iva = precio*6/100;
                else
                    iva = 0;
                
                cadena = "INSERT INTO ArtFab VALUES ('"+rs.getString(1)+"','"
                        +rs.getString(2)+"',"+precio+","+iva+")";
                st1.executeUpdate(cadena);
            }
            
            cadena = "SELECT * FROM ArtFab";
            
            rs = st.executeQuery(cadena);
            
            while(rs.next()){
                System.out.println(rs.getString(1)+"--"+rs.getString(2)+"--"
                    +rs.getInt(3)+"--"+rs.getInt(4));
            }
            
            
            
            
            st.close();
            st1.close();
            con.close();
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
    }
}
