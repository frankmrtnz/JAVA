
package RepasoExamen.Ej1;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        try {
            Scanner teclado = new Scanner(System.in);
            
            File f = new File("datos.dat");
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/Empresa";
            String user = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, user, password);
            
            
            String cadena="delete from empleado where Emp_no=?";
            PreparedStatement ps1 = con.prepareStatement(cadena);
            
            

            String op,numemp,nombre;
            int salario,pc,numdept;
            
            try {                
                while(true){
                    op=dis.readUTF();
                    if(op.equalsIgnoreCase("B")){
                        numemp=dis.readUTF();
                        System.out.println(op+" "+numemp);
                    }
                    else if(op.equalsIgnoreCase("A")){
                        numemp=dis.readUTF();
                        nombre=dis.readUTF();
                        salario=dis.readInt();
                        numdept=dis.readInt();
                        System.out.println(op+" "+numemp+" "+nombre+" "+salario+" "+numdept);
                    }
                    else {
                        numemp=dis.readUTF();
                        pc=dis.readInt();
                        System.out.println(op+" "+numemp+" "+pc);
                    } 
                }
            } catch (EOFException ex) {}
            
            
            dis.close();
            fis.close();
            
        }catch(IOException ex){
            System.out.println(ex);
        }catch(ClassNotFoundException ex){
            System.out.println(ex);
        }catch(SQLException ex){
            System.out.println(ex);
        }
        
        
        
    }
}
