/*
2º.- Sea la base de datos juego, que se crea al ejecutar el script juego.sql y que está formada 
por las tablas Personaje, Arma y Escudo. Se pide, utilizando el fichero de texto jugadas.txt 
actualizar la tabla Personaje, atendiendo a las siguientes condiciones:
. Cada línea del fichero de texto está compuesta por:
    Cod_Personaje, cod_Arma, Cod_Personaje, cod_Escudo. 
El personaje que va en primer lugar es el que ataca con el arma que va a continuación y 
el segundo personaje es el que se defiende con el escudo que va a continuación. 
Cada arma y cada escudo tienen asociados un valor q
...
*/

package EjercicioBBDDyFicheros.Ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio2 {
 public static void main(String[] args) {
     try{
      Class.forName("com.mysql.jdbc.Driver");   
      String url="jdbc:mysql://localhost/juego";
      String user="root";
      String password="";
      Connection con=DriverManager.getConnection(url, user, password);
      Statement st=con.createStatement();
      String cadena="select vida from personaje where id=?";
      PreparedStatement ps=con.prepareStatement(cadena);
      cadena="select dano from arma where codAr=?";
      PreparedStatement ps1=con.prepareStatement(cadena);
      cadena="select defensa from escudo where codEs=?";
      PreparedStatement ps2=con.prepareStatement(cadena);
      cadena="update personaje set vida=? where id=?";
      PreparedStatement ps3=con.prepareStatement(cadena);
      cadena="delete from personaje where vida<?";
      PreparedStatement ps4=con.prepareStatement(cadena);
      
      ResultSet rs,rs1,rs2;
      System.out.println("--TABLA PERSONAJE INICIAL--");
      rs=st.executeQuery("select * from personaje");
      String[] valores;
      int vidaat,vidadef,dano,def,vidasini=0;
      while(rs.next()){
       vidasini=rs.getInt(3);   
       System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
      }
         
      File f=new File("jugadas.txt");
      FileReader fr=new FileReader(f);
      BufferedReader br=new BufferedReader(fr);
     
      
      cadena=br.readLine();
      while(cadena!=null){
       valores=cadena.split(",");
       System.out.println("El personaje "+valores[0]+" va a atacar al personaje "+valores[2]);
       ps.setInt(1, Integer.parseInt(valores[0]));
       rs=ps.executeQuery();
       if(rs.next()){
        vidaat=rs.getInt(1);
        ps.setInt(1, Integer.parseInt(valores[2]));
        rs=ps.executeQuery();
        if(rs.next()){
         vidadef=rs.getInt(1);
         ps1.setInt(1, Integer.parseInt(valores[1]));
         rs1=ps1.executeQuery();
         if(rs1.next()){
           dano=rs1.getInt(1);
           ps2.setInt(1, Integer.parseInt(valores[3]));
           rs2=ps2.executeQuery();
           if(rs2.next()){
             def=rs2.getInt(1);
             if(dano>def){
               vidadef=vidadef-(dano-def);
               ps3.setInt(1, vidadef);
               ps3.setInt(2, Integer.parseInt(valores[0]));
             }else{
               vidaat=vidaat-(def-dano);
               ps3.setInt(1, vidaat);
               ps3.setInt(2, Integer.parseInt(valores[2]));  
             }
             ps3.executeUpdate();
           }else System.out.println("El escudo no existe");
         }else System.out.println("El arma no existe");
        }else System.out.println("El personaje defensor no existe en la base de datos");
       }else System.out.println("El personaje atacante no existe en la base de datos");
       cadena=br.readLine();
      }
      
      br.close();
      fr.close();
      
      /*cadena="delete from personaje where vida<"+vidasini/2;
      st.executeUpdate(cadena);*/
      ps4.setInt(1, vidasini/2);
      ps4.executeUpdate();
      
      System.out.println("--TABLA PERSONAJE FINAL--");
      rs=st.executeQuery("select * from personaje");
      while(rs.next()){
       System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
      }
      
      
      st.close();
      con.close();
      
      
         
     }catch(ClassNotFoundException ex){
      System.out.println(ex);
     }catch(IOException ex){
      System.out.println(ex);   
     }catch(SQLException ex){
      System.out.println(ex);   
     }  
  }
}

