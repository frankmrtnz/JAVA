
package Ejercicios_BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");     //Hacen la conexion con MYSQL
            String url = "jdbc:mysql://localhost/instituto";   //Nos conectamos a la BD instituto
            String user = "root";
            String password = "";            
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            Statement st1 = con.createStatement();
            /*
            String cadena = "create table NotasFinales("
                    + "mat varchar(10),"
                    + "cod varchar(2),"
                    + "NotaMedia decimal(3),"
                    + "primary key(mat,cod))";
            st.execute(cadena);
            
            
            String cadena;
            ResultSet rs = st.executeQuery("select * from notas"); //Clase que genera objeto para poder hacer consulta
            
            while(rs.next()){
                String mat = rs.getString(1);
                String cod = rs.getString(2);
                int media = ((rs.getInt(3)+rs.getInt(4)+rs.getInt(5))/3);
                cadena = "insert into NotasFinales values ('"+mat+"','"+cod+"',"+media+")";
                st1.executeUpdate(cadena);
            }
            */
            
            String cadena = "SELECT apel_nom, nombre, nota1, nota2, nota3, notamedia "
                    + "FROM alumnos, asignaturas, notas, notasfinales "
                    + "WHERE alumnos.mat=notasfinales.mat AND asignaturas.cod=notasfinales.cod "
                    + "AND notas.mat=notasfinales.mat AND asignaturas.cod=notas.cod";
            ResultSet rs = st.executeQuery(cadena);
            
            while(rs.next()){
                System.out.println(rs.getString(1)+"----"+rs.getString(2)+
                        "----"+rs.getString(3)+"----"+rs.getString(4)+
                        "----"+rs.getString(5)+"----"+rs.getString(6));
            }
            
            
            
            
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
