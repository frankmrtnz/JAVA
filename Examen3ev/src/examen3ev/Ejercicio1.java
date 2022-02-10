
package examen3ev;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        try {
            
            File f = new File("asegurados.dat");
            FileInputStream fis = new FileInputStream(f);  //Lectura
            DataInputStream dis = new DataInputStream(fis);    
            
            File f1 = new File("asegurados2.dat");
            FileOutputStream fos = new FileOutputStream(f1); //Escritura
            DataOutputStream dos = new DataOutputStream(fos);
            
            String idPol;
            int nP;
            double pr;
            try{
            
            
            
            while(true){
                idPol = dis.readUTF();
                nP = dis.readInt();
                pr = dis.readDouble();
                
                
                if(nP < 5){
                    pr = pr*0.95;
                    dos.writeUTF(idPol);
                    dos.writeInt(nP);
                    dos.writeDouble(pr);
                }
                else if(nP >= 5 && nP < 7){
                    pr = pr;
                    dos.writeUTF(idPol);
                    dos.writeInt(nP);
                    dos.writeDouble(pr);
                }
                else if(nP >=7 && nP < 10){
                    pr = pr*1.10;
                    dos.writeUTF(idPol);
                    dos.writeInt(nP);
                    dos.writeDouble(pr);
                }
                else {
                    System.out.print("(Se borra)");
                    idPol="";
                    nP=0; pr=0;
                }
                
                System.out.println(idPol+" "+nP+" "+pr);
                
                
            }
            
                
            } catch (EOFException ex){
                System.out.println("No hay más datos");
            }
            
            dis.close();
            fis.close();
            
            
            FileInputStream fis2 = new FileInputStream(f1);  //Lectura
            DataInputStream dis2 = new DataInputStream(fis2);
            //f.delete();
            /*if(!f.exists()){
                FileOutputStream fos2 = new FileOutputStream(f); //Escritura
                DataOutputStream dos2 = new DataOutputStream(fos);
                dos2.close();
                fos2.close();
            }*/
            
            
            
            try{
                while(true){
                idPol = dis2.readUTF();
                nP = dis2.readInt();
                pr = dis2.readDouble();
                
                System.out.println(idPol+" "+nP+" "+pr);
                
                
                /*dos2.writeUTF(idPol);
                dos2.writeInt(nP);
                dos2.writeDouble(pr);*/
                }
                
             
            } catch(EOFException ex){
                System.out.println("No hay más datos");
            } 
            
            
            dis2.close();
            fis2.close();
            
            
            /*FileInputStream fis3 = new FileInputStream(f);  //Lectura
            DataInputStream dis3 = new DataInputStream(fis);
            
            try{
                while(true){
                    idPol = dis3.readUTF();
                    nP = dis3.readInt();
                    pr = dis3.readDouble();
                
                    System.out.println(idPol+" "+nP+" "+pr);
                }
            }catch (EOFException ex){
                System.out.println("No hay más datos");
            } catch(IOException ex){
                System.out.println(ex);
            }
            
            dis3.close();
            fis3.close();*/
           
            
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        
    }
}
