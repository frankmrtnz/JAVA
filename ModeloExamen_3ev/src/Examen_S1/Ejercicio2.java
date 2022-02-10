/*
2º.- Hacer un programa que actualice la tabla Estadísticas, del ejercicio anterior, con los datos
 que se recogen en fichero binario futbol.bin, utilizando sentencias preparadas.
 La estructura que tiene dicho fichero es:
 Operación(String), CodEquipo(String), Ganados(int), Perdidos(int) , Empatados(int)
 El campo Operación tendrá una “A”, una “B” o una “M”,
• Si es una “A” y el equipo ya existe se informará de que no es posible realizar la
 operación pues ya existe, en caso contrario se dará de alta, tanto en Estadísticas
 como en Equipos. Los datos que faltan se pedirán por teclado.
• Si es una “M” y el equipo no existe se informará de que no es posible realizar la
operación pues no existe el equipo, en caso contrario se actualizarán los 3 campos
que vienen, así como el campo puntos.
• Si es una “B” y el equipo no existe se informará de que no es posible realizar la
operación pues no existe el equipo, en caso contrario se borrará de la tabla Equipos
y de Estadísticas.
Además, se va a generar el fichero de texto clasificacion.txt, en el que se va a ir guardando
 “El equipo XXXXXX tiene XXX Goles a Favor, XXX Goles en Contra y XXX Puntos”
 Finalmente, mostrar en pantalla el fichero de texto generado.
*/
package Examen_S1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/Futbol";
            String user = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, user, password);

            File f = new File("futbol.bin");
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Estadisticas");
            
            System.out.println("TABLAS INICIALES:");
            System.out.println("---TABLA Estadisticas---");
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+
                    " "+rs.getInt(5)+" "+rs.getInt(6)+" "+rs.getInt(7));
            }
            
            rs = st.executeQuery("select * from Partidos");
            System.out.println("---TABLA Partidos---");
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+
                        " "+rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getInt(6));
            }
            
            
            //SENTENCIAS PREPARADAS
            String cadena = "insert into Estadisticas values(?,?,?,?,?,?,?)";
            PreparedStatement ps1 = con.prepareStatement(cadena);
            cadena = "insert into Equipos values(?,?,?)";
            PreparedStatement ps2 = con.prepareStatement(cadena);
            cadena = "update Estadisticas set PGanados=?, PPerdidos=?, PEmpatados=?, Puntos=? "
                    + "where CodEquipo=?";
            PreparedStatement ps3 = con.prepareStatement(cadena);
            cadena = "delete from Estadisticas where CodEquipo=?";
            PreparedStatement ps4 = con.prepareStatement(cadena);
            cadena = "delete from Equipos where CodEquipo=?";
            PreparedStatement ps5 = con.prepareStatement(cadena);
            cadena = "select CodEquipo from Estadisticas where CodEquipo=?";
            PreparedStatement ps6 = con.prepareStatement(cadena);
            
            ResultSet rs6;
            String op, CodE;
            int g, p, e, pt;
            
            try {
                 
                while(true){
                    op = dis.readUTF();   //Operacion
                    CodE = dis.readUTF();   //CodEquipo  
                    g = dis.readInt();   //Ganados
                    p = dis.readInt();   //Perdidos
                    e = dis.readInt();   //Empates
                    pt = 3*g+e;   //Puntos
                    
                    ps6.setString(1, CodE);
                    rs6 = ps6.executeQuery();
                    
                    while(rs6.next()){
                        System.out.println(rs6.getString(1));
                        boolean existe=false;
                        existe = true;
                    
                    if(op.equalsIgnoreCase("A")){
                        /*
                        Si es una “A” y el equipo ya existe se informará de que no es posible realizar la
                        operación pues ya existe, en caso contrario se dará de alta, tanto en Estadísticas
                        como en Equipos. Los datos que faltan se pedirán por teclado.
                        */
                        
                        if(rs6.getString(1).equalsIgnoreCase(CodE)){
                            System.out.println("No es posible realizar el alta pues ya existe");
                        } else {
                            //Insert en Estadisticas
                            int gf=0, gc=0;
                            ps1.setString(1, CodE);
                            ps1.setInt(2, g);
                            ps1.setInt(3, p);
                            ps1.setInt(4, e);
                            System.out.println("Introduce los goles a favor del equipo "+CodE);
                            gf = teclado.nextInt();
                            System.out.println("Introduce los goles en contra del equipo "+CodE);
                            gc = teclado.nextInt();
                            ps1.setInt(5, gf);
                            ps1.setInt(6, gc);
                            ps1.setInt(7, pt);
                            ps1.executeUpdate();

                            //Insert en Partidos
                            String nom, loc;
                            ps2.setString(1,CodE);
                            System.out.println("Introduce nombre del equipo "+CodE);
                            nom = teclado.nextLine();
                            System.out.println("Introduce localidad del equipo "+CodE);
                            loc = teclado.nextLine();
                            ps2.setString(2, nom);
                            ps2.setString(3, loc);
                            ps2.executeUpdate();

                            }
                        
                    }
                    else if(op.equalsIgnoreCase("M")){
                        /*
                        Si es una “M” y el equipo no existe se informará de que no es posible realizar la
                        operación pues no existe el equipo, en caso contrario se actualizarán los 3 campos
                        que vienen, así como el campo puntos.
                        */

                        if(rs6.getString(1).equalsIgnoreCase(CodE)){
                            ps3.setInt(1, g);
                            ps3.setInt(2, p);
                            ps3.setInt(3, e);
                            ps3.setInt(4, pt);
                            ps3.setString(5, CodE);
                            ps3.executeUpdate();
                            } else {
                                System.out.println("No fue posible realizar operación pues el equipo "+CodE+" no existe en la tabla Estadisticas");
                            }   
                    }
                    else if(op.equalsIgnoreCase("B")){
                        /*
                        Si es una “B” y el equipo no existe se informará de que no es posible realizar la
                        operación pues no existe el equipo, en caso contrario se borrará de la tabla Equipos
                        y de Estadísticas.
                        */

                        if(rs6.getString(1).equalsIgnoreCase(CodE)){
                            ps4.setString(1, CodE);
                            ps4.executeUpdate();
                            ps5.setString(1, CodE);
                            ps5.executeUpdate();
                        } else {
                                System.out.println("No fue posible realizar la operación pues el equipo "+CodE+" no existe en la tabla Estadisticas");
                        }
                        
                    }
                    else {
                        System.out.println("La operación que se quiere hacer no se reconoce");
                    }
                    
                }
                }
            } catch(EOFException ex){
                System.out.println("No hay más datos en el fichero de 'Futbol.bin'");
            }
            
            dis.close();
            fis.close();
            

            
           
            /*
            Además, se va a generar el fichero de texto clasificacion.txt, en el que se va a ir guardando
            “El equipo XXXXXX tiene XXX Goles a Favor, XXX Goles en Contra y XXX Puntos”
            Finalmente, mostrar en pantalla el fichero de texto generado.
            */   
            File f1 = new File("texto.txt");
            FileWriter fw = new FileWriter(f1);
            
            String cod, texto;
            int goalsf,goalsc,points;
            rs = st.executeQuery("select CodEquipo,GolFav,GolCont,Puntos from Estadisticas");
            while(rs.next()){
                cod = rs.getString(1);
                goalsf = rs.getInt(2);
                goalsc = rs.getInt(3);
                points = rs.getInt(4);
                texto = "El equipo "+cod+" tiene "+goalsf+" Goles a Favor, "+goalsc+" Goles en Contra "
                        + "y "+points+" Puntos.\n";
                fw.write(texto);
            }
            
            fw.close();    
            
            FileReader fr = new FileReader(f1);   
            BufferedReader br = new BufferedReader(fr);
            
            String frase = br.readLine();
            while(frase != null) {
                System.out.println(frase);
                frase = br.readLine();
            }
            
            br.close();
            fr.close();
            
            rs.close();
            st.close();
            
            ps6.close();
            ps5.close();
            ps4.close();
            ps3.close();
            ps2.close();
            ps1.close();

            con.close();
        
        
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        } 
        
    }
}
