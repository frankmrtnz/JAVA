
package EjerciciosFicheros.Serializables.Ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        File f=new File("agenda.obj");
        File f1=new File("eliminados.txt");
        int opc;
        try{
          if(!f.exists()) {
            FileOutputStream fos=new FileOutputStream(f);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.close();
            fos.close();
          } 
          opc=Menu(teclado);
          
          while(opc!=6){
            switch(opc){
                case 1: Anadir(teclado,f);
                        break;
                case 2: MostrarPersona(teclado,f);
                        break;
                case 3: MostrarAgenda(f);
                        break;
                case 4: Modificar(teclado,f);
                        break;
                case 5: Borrar(teclado,f,f1);
                        break;
                default:System.out.println("Opcion incorrecta");
                        break;
            }  
            opc=Menu(teclado);  
          }
        if(f1.exists()){
          FileReader fr=new FileReader(f1);
          BufferedReader br=new BufferedReader(fr);
          System.out.println("Las personas eliminadas de la agenda son ");
          String cadena=br.readLine();
          while(cadena!=null){
            System.out.println(cadena);
            cadena=br.readLine();
           }
        
           br.close();
           fr.close();
        }else System.out.println("El fichero de Eliminados no existe pues no se ha borrado ninguna persona ");
            
        }catch(IOException ex){
          System.out.println(ex);
        }
    }
    
    static int Menu(Scanner t){
        System.out.println("1.Añadir persona a la agenda");
        System.out.println("2.Mostrar persona de la agenda");
        System.out.println("3.Mostrar toda la agenda");
        System.out.println("4.Modificar telefono o mail de una persona");
        System.out.println("5.Eliminar persona de la agenda");
        System.out.println("6.Salir");
        System.out.print("Escoger una opcion: ");
        int opc=t.nextInt();
        return opc;
    }
   
    static void Anadir(Scanner t,File f){
        try{
          t.nextLine();
          String nom,ape,tel,mail;
          FileOutputStream fos=new FileOutputStream(f,true);
          MiClase mc=new MiClase(fos);
          System.out.println("Introducir Nombre");
          nom=t.nextLine();
          System.out.println("Apellidos");
          ape=t.nextLine();
          System.out.println("Telefono sin espacios en blanco");
          tel=t.next();
          System.out.println("Email");
          mail=t.next();
          Agenda ag=new Agenda(nom,ape,tel,mail);
          mc.writeObject(ag);
          mc.close();
          fos.close();
          
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
    
  static void MostrarPersona(Scanner t,File f){
      try{
         t.nextLine();
         FileInputStream fis=new FileInputStream(f);
         ObjectInputStream ois=new ObjectInputStream(fis);
         Agenda ag;
         String nom,ape;
         System.out.println("Introducir nombre de la persona a mostrar");
         nom=t.nextLine();
         System.out.println("Introducir apellidos de la persona a mostrar");
         ape=t.nextLine();
         boolean noexiste=true;
         try{
           while(true){
             ag=(Agenda)ois.readObject();
             if(ag.getNombre().equalsIgnoreCase(nom)&&ag.getApellidos().equalsIgnoreCase(ape)){
                   System.out.println(ag.toString());
                   noexiste=false;
             }
           }
         }catch(EOFException ex){}
         
         if(noexiste)
          System.out.println("La persona introducida no esta en tu agenda");
         
         ois.close();
         fis.close();
      }catch(IOException ex){
          System.out.println(ex);
      }catch(ClassNotFoundException ex){
          System.out.println(ex);
      }
  } 
  
  static void MostrarAgenda(File f) {
      try{
        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Agenda ag;
        try{
            while(true){
             ag=(Agenda)ois.readObject();
             System.out.println(ag.toString());
            }
        }catch(EOFException ex){}
          ois.close();
          fis.close();
      }catch(IOException ex){
        System.out.println(ex);
      }catch(ClassNotFoundException ex){
          System.out.println(ex);   
      }
  }
  
  static void Modificar(Scanner t,File f){
      t.nextLine();
      try{
        File f1=new File("auxiliar.obj");
        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
        FileOutputStream fos=new FileOutputStream(f1);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        Agenda ag;
        boolean noexiste=true;
        String nom,ape,tel,mail;
        System.out.println("Introducir nombre de la persona a modificar");
        nom=t.nextLine();
        System.out.println("Introducir apellidos de la persona a modificar");
        ape=t.nextLine();
        try{
          while(true){ 
           ag=(Agenda)ois.readObject();
           if(ag.getNombre().equalsIgnoreCase(nom)&&ag.getApellidos().equalsIgnoreCase(ape)){
             System.out.println("Nuevo Telefono sin espacios en blanco");
             tel=t.next();
             System.out.println("Nuevo Email");
             mail=t.next();
             ag.setTelefono(tel);
             ag.setMail(mail);
             noexiste=false;
           }
           oos.writeObject(ag);
         } 
        }catch(EOFException ex){}
        oos.close();
        fos.close();
        ois.close();
        fis.close();
        
        f.delete();
        f1.renameTo(f);
        
        if(noexiste)
         System.out.println("La persona introducida para modificar no existe");
        
      }catch(IOException ex){
       System.out.println(ex);
      }catch(ClassNotFoundException ex){
          System.out.println(ex);
      }
  }
  
  static void Borrar(Scanner t,File f,File f1){
     t.nextLine();
     try{
       File f2=new File("auxiliar.obj");
       FileWriter fw=new FileWriter(f1,true);
       BufferedWriter bw=new BufferedWriter(fw);
       FileInputStream fis=new FileInputStream(f);
       ObjectInputStream ois=new ObjectInputStream(fis);
       FileOutputStream fos=new FileOutputStream(f2);
       ObjectOutputStream oos=new ObjectOutputStream(fos);
       Agenda ag;
       boolean noexiste=true;
       String nom,ape;
       System.out.println("Introducir nombre de la persona a modificar");
       nom=t.nextLine();
       System.out.println("Introducir apellidos de la persona a modificar");
       ape=t.nextLine();
        try{
          while(true){ 
           ag=(Agenda)ois.readObject();
           if((ag.getNombre().equalsIgnoreCase(nom)&&ag.getApellidos().equalsIgnoreCase(ape))){
            bw.write(nom+" "+ape);
            bw.newLine();
            noexiste=false;
          }else oos.writeObject(ag);
         } 
        }catch(EOFException ex){}
        oos.close();
        fos.close();
        ois.close();
        fis.close();
        bw.close();
        fw.close();
        
        f.delete();
        f2.renameTo(f);
        
        if(noexiste)
         System.out.println("La persona introducida para borrar no existe");
        
      }catch(IOException ex){
       System.out.println(ex);
      }catch(ClassNotFoundException ex){
          System.out.println(ex);
      } 
  }
}
