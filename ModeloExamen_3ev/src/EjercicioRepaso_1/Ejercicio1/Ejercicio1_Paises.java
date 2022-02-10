/*
1º.- Se tiene la clase Paises cuyos atributos son los siguientes:
 Id entero, nombre cadena, capital cadena e idioma cadena
 Mediante un menú, hacer lo siguiente:
a) Crear el fichero serializable paises.obj
b) Añadir países al fichero, cuyos valores se pedirán por teclado.
c) Listar toda la información contenida en el fichero.
d) Consultar un registro por el nombre del país, que se pedirá por teclado.
e) Actualizar la información del fichero pudiendo modificar la información de
 cualquiera de los atributos excepto el Id que no se podrá modificar.
*/

package EjercicioRepaso_1.Ejercicio1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ejercicio1_Paises {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner teclado = new Scanner(System.in);
    
        int id;
        String nombre, capital, idioma;
        
        File f = new File("paises.obj");
        Ej1_Paises p;
        
        int opc;
        opc = Menu(teclado);
        while(opc!=6){
            switch(opc){
                case 1: creaFichero(f);
                    break;
                case 2: anadeFichero(teclado, f);
                    break;
                case 3: listarFichero(teclado, f);
                    break;
                case 4: consultarFichero(teclado, f);
                    break;
                case 5: actualizarFichero(teclado, f);
                    break;
                default: System.out.println("Opción incorrecta");
                    break;
            }
            opc = Menu(teclado);
        }

    }
    
    
    static int Menu(Scanner t){
        System.out.println("1. Crea fichero serializable ('datos.obj')");
        System.out.println("2. Añadir paises al fichero");
        System.out.println("3. Listar toda la información del fichero");
        System.out.println("4. Consultar registro por nombre de país");
        System.out.println("5. Actualizar información del fichero");
        System.out.println("6. Salir");
        int opc = t.nextInt();
        return opc;
    }
    
    
    static void creaFichero(File f){
        try {  
            
            if(!f.exists()) {
                FileOutputStream fos=new FileOutputStream(f);
                ObjectOutputStream oos=new ObjectOutputStream(fos);
                oos.close();
                fos.close();
                System.out.println("Fichero "+f+" creado");
            } else {
                System.out.println("El fichero "+f+" ya existe");
            }
         
        } 
        catch (IOException ex) {
           System.out.println(ex);
        } 
    }
    
    
    static void anadeFichero(Scanner t, File f){
        try {
            
            int id;
            String nombre, capital, idioma;
            System.out.println("Introduce id");
            id = t.nextInt();
            t.nextLine();
            System.out.println("Introduce nombre");
            nombre = t.nextLine();
            System.out.println("Introduce capital");
            capital = t.nextLine();
            System.out.println("Introduce idioma");
            idioma = t.nextLine();
            
            Ej1_Paises p;

            if(f.exists()) {
                FileOutputStream fos = new FileOutputStream(f, true);  //Escritura
                Ej1_MiClase mc = new Ej1_MiClase(fos);        
                
                p = new Ej1_Paises(id,nombre,capital,idioma);
                mc.writeObject(p);
                
                mc.close();
                fos.close();
            } else {
                System.out.println("El fichero no existe!");
            }

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    
    static void listarFichero(Scanner t, File f) {   
        try {
            
            Ej1_Paises p;
            
            if(f.exists()){
                
                FileInputStream fis = new FileInputStream(f);   //Lectura
                ObjectInputStream ois = new ObjectInputStream(fis);
                
                try {                    
                    while(true) {
                        p = (Ej1_Paises)ois.readObject();
                        System.out.println(p.toString());
                    }
                } catch (EOFException ex) {
                    System.out.println("NO HAY MAS DATOS");
                }
                
                ois.close();
                fis.close();
            } else {
                    System.out.println("El fichero no existe!");
            }
        
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex){
            System.out.println(ex);
        }
    }
    
    
    static void consultarFichero(Scanner t, File f) {
        try {
            
            String nombre_p;
            Ej1_Paises p = null;

            
            if(f.exists()){
                
                t.nextLine();
                System.out.println("Introduce nombre del país a consultar");
                nombre_p = t.nextLine();
                
                FileInputStream fis = new FileInputStream(f);   //Lectura
                ObjectInputStream ois = new ObjectInputStream(fis);
                
                try {
                    while(true){
                        p = (Ej1_Paises)ois.readObject();
                        if(p.getNombre().equalsIgnoreCase(nombre_p)){
                            System.out.println(p.toString());
                        }
                    }             
                    
                } catch (EOFException ex) {
                    System.out.println("NO HAY MAS DATOS");
                }
            } else {
                System.out.println("El fichero no existe!");
            }
            
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex){
            System.out.println(ex);
        }
    }
    
    
    static void actualizarFichero(Scanner t, File f){
        try {
            
            String nombre_p;
            Ej1_Paises p = null;

            
            if(f.exists()){
                
                t.nextLine();
                System.out.println("Introduce nombre del país a modificar");
                nombre_p = t.nextLine();
                
                FileInputStream fis = new FileInputStream(f);   //Lectura
                ObjectInputStream ois = new ObjectInputStream(fis);
                
                try {
                    while(true){
                        p = (Ej1_Paises)ois.readObject();
                        if(p.getNombre().equalsIgnoreCase(nombre_p)){
                            System.out.println(p.toString()); 
                        int campo;
                            System.out.println("¿Que campo quiere modificar?");
                            System.out.println("1. Nombre");
                            System.out.println("2. Capital");
                            System.out.println("3. Idioma");
                            campo = t.nextInt();
                            if(campo == 1){
                                String nom;
                                System.out.println("Introduce nombre a modificar del país "+p.getNombre());
                                t.nextLine();
                                nom = t.nextLine();
                                p.setNombre(nom);
                            } else if(campo == 2){
                                String cap;
                                System.out.println("Introduce capital a modificar del país "+p.getNombre());
                                cap = t.nextLine();
                                p.setCapital(cap);
                            } else if(campo == 3){
                                String idiom;
                                System.out.println("Introduce idioma a modificar del país "+p.getNombre());
                                idiom = t.nextLine();
                                p.setIdioma(idiom);
                            } else {
                                System.out.println("Numero introducido no valido");
                            }
                            System.out.print("Información actualizada:");
                            System.out.println(p.toString());    
                        }
                        
                    }             
                    
                } catch (EOFException ex) {
                    System.out.println("NO HAY MAS DATOS");
                }
            } else {
                System.out.println("El fichero no existe!");
            }

        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    
    
}
    
