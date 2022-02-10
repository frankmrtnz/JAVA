
package examen3ev;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class Ejercicio2 {
    public static void main(String[] args) {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/Universidad";
            String user = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from profesor");

            
            String cadena = "insert into Profesor values(?,?,?,?)";
            PreparedStatement ps1 = con.prepareStatement(cadena);
            cadena = "delete from Profesor where Id=?";
            PreparedStatement ps2 = con.prepareStatement(cadena);
            cadena = "update Profesor set ID=?, Nombre=?, Apellidos=?, Especialidad=? where Id=?";
            PreparedStatement ps3 = con.prepareStatement(cadena);
            
            int id, operacion;
            String nombre, apellidos, especialidad;
            
  
            
            try {
                File f = new File("datos.txt");
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                
                File f1 = new File("errores.txt");
                
                                
                
                
                String cadena2;
                String[] campos;
                
                cadena2 = br.readLine();
                
                while(cadena2 != null) { 
                    campos = cadena2.split(" ");
                    System.out.println(campos[0]+" "+campos[1]+" "+campos[2]+" "+campos[3]);
                    
                    while(rs.next()){
                        if(campos[3].equalsIgnoreCase("1")){
                    //alta
                    while(rs.next()){
                    ps1.setString(1, campos[0]);
                    ps1.setString(2, campos[1]);
                    ps1.setString(3, campos[2]);
                    ps1.setString(4, campos[3]);
                    if(rs.getString(1).equalsIgnoreCase(campos[0])){
                    FileWriter fw = new FileWriter(f1);
                    BufferedWriter bw = new BufferedWriter(fw);
                    
                    bw.write("El registro "+rs.getString(1)+" no se puede dar de alta pues ya existe");
                    
                    bw.close();
                    fw.close();
                    } else{
                    ps1.executeUpdate();
                    }
                    }
                    }
                    else if(campos[3].equalsIgnoreCase("2")){
                    //baja
                    while(rs.next()){
                    ps2.setString(1, campos[0]);
                    if(!rs.getString(1).equalsIgnoreCase(campos[0])){
                    FileWriter fw = new FileWriter(f1);
                    BufferedWriter bw = new BufferedWriter(fw);
                    
                    bw.write("El registro "+rs.getString(1)+" no se puede dar de baja pues NO existe");
                    
                    bw.close();
                    fw.close();
                    } else {
                    ps2.executeUpdate();
                    }
                    }
                    }
                    else if(campos[3].equalsIgnoreCase("3")){
                    //modificacion
                    while(rs.next()){
                    ps3.setString(1, campos[0]);
                    ps3.setString(2, campos[1]);
                    ps3.setString(3, campos[2]);
                    ps3.setString(4, campos[3]);
                    ps3.setString(5, rs.getString(1));
                    if(!rs.getString(1).equalsIgnoreCase(campos[0])){
                    FileWriter fw = new FileWriter(f1);
                    BufferedWriter bw = new BufferedWriter(fw);
                    
                    bw.write("El registro "+rs.getString(1)+" no se puede modificar pues NO existe");
                    
                    bw.close();
                    fw.close();
                    } else {
                    ps3.executeUpdate();
                    }
                    }
                    }

                    }
                    
                    
                    cadena= br.readLine();
                }
                
               
                br.close();
                fr.close(); 
                
            } catch (IOException ex) {
                System.out.println(ex);
            }
             
            /*
            FileReader fr2 = new FileReader(f1);
            BufferedReader br2 = new BufferedReader(fr2);
            
            String cadena3 = br2.readLine(); 
            
            br2.close();
            fr2.close();            
            
            st.close();
            con.close();
            */
            
            ResultSet rs2 = st.executeQuery("select * from profesor");
            while(rs2.next()){
                System.out.println(rs2.getString(1)+" "+rs2.getString(2)+" "+rs2.getString(3)+" "+rs2.getString(4));
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        } 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}




/*if(campos[3].equalsIgnoreCase("1")){
                    //alta
                    while(rs.next()){
                    ps1.setString(1, campos[0]);
                    ps1.setString(2, campos[1]);
                    ps1.setString(3, campos[2]);
                    ps1.setString(4, campos[3]);
                    if(rs.getString(1).equalsIgnoreCase(campos[0])){
                    FileWriter fw = new FileWriter(f1);
                    BufferedWriter bw = new BufferedWriter(fw);
                    
                    bw.write("El registro "+rs.getString(1)+" no se puede dar de alta pues ya existe");
                    
                    bw.close();
                    fw.close();
                    } else{
                    ps1.executeUpdate();
                    }
                    }
                    }
                    else if(campos[3].equalsIgnoreCase("2")){
                    //baja
                    while(rs.next()){
                    ps2.setString(1, campos[0]);
                    if(!rs.getString(1).equalsIgnoreCase(campos[0])){
                    FileWriter fw = new FileWriter(f1);
                    BufferedWriter bw = new BufferedWriter(fw);
                    
                    bw.write("El registro "+rs.getString(1)+" no se puede dar de baja pues NO existe");
                    
                    bw.close();
                    fw.close();
                    } else {
                    ps2.executeUpdate();
                    }
                    }
                    }
                    else if(campos[3].equalsIgnoreCase("3")){
                    //modificacion
                    while(rs.next()){
                    ps3.setString(1, campos[0]);
                    ps3.setString(2, campos[1]);
                    ps3.setString(3, campos[2]);
                    ps3.setString(4, campos[3]);
                    ps3.setString(5, rs.getString(1));
                    if(!rs.getString(1).equalsIgnoreCase(campos[0])){
                    FileWriter fw = new FileWriter(f1);
                    BufferedWriter bw = new BufferedWriter(fw);
                    
                    bw.write("El registro "+rs.getString(1)+" no se puede modificar pues NO existe");
                    
                    bw.close();
                    fw.close();
                    } else {
                    ps3.executeUpdate();
                    }
                    }
                    }*/
