
package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<Productos> lista = new ArrayList<Productos>();
        
        Productos p1, p2, p3;
        p1 = new Productos("producto1", 1) {};
        p2 = new Productos("producto2", 2) {};
        p3 = new Productos("producto3", 3) {};
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        
        ArrayList<Perecederos> lista2 = new ArrayList<Perecederos>();
        Perecederos pe1, pe2, pe3;     
        pe1 = new Perecederos(3,"producto4",4);
        pe2 = new Perecederos(2,"producto5",5);
        pe3 = new Perecederos(1,"producto6",6);
        lista.add(pe1);
        lista.add(pe2);
        lista.add(pe3);
        
        ArrayList<No_Perecederos> lista3 = new ArrayList<No_Perecederos>();
        No_Perecederos npe1, npe2, npe3;
        npe1 = new No_Perecederos("limpieza","producto7",7);
        npe2 = new No_Perecederos("conservas","producto8",8);
        npe3 = new No_Perecederos("conservas","producto9",9);
        lista.add(npe1);
        lista.add(npe2);
        lista.add(npe3);
        
        
        int operacion = Menu(teclado);
        
        while (operacion <= 4){
            System.out.println("Ha elegido la opción "+operacion);
            
            switch(operacion){
                case 1: AltaProducto(teclado, lista,lista2,lista3);
                    break;
                case 2: BajaProducto(teclado, lista,lista2,lista3); 
                    break;
                case 3: MostrarPrecioTotal(teclado, lista,lista2,lista3);
                    break;
                case 4: MostrarInfoTotal(teclado, lista,lista2,lista3);
            }            
            operacion = Menu(teclado);
        }
        
    }   // Cierra el psvm  
    
    
    public static int Menu(Scanner t){
        int opc;
        System.out.println("\n -------------------------------- \n");
        System.out.println("1. ALTA PRODUCTO");
        System.out.println("2. BAJA PRODUCTO");
        System.out.println("3. MOSTRAR PRECIO TOTAL");
        System.out.println("4. MOSTRAR INFO TOTAL");
        opc = t.nextInt();
        return opc;
    }
    
    public static void AltaProducto(Scanner t, ArrayList<Productos> lista, ArrayList<Perecederos> lista2, ArrayList<No_Perecederos> lista3){
        
    }
    
    public static void BajaProducto(Scanner t, ArrayList<Productos> lista, ArrayList<Perecederos> lista2, ArrayList<No_Perecederos> lista3){
        
    }
    
    public static void MostrarPrecioTotal(Scanner t, ArrayList<Productos> lista, ArrayList<Perecederos> lista2, ArrayList<No_Perecederos> lista3){
        
    }
    
    public static void MostrarInfoTotal(Scanner t, ArrayList<Productos> lista, ArrayList<Perecederos> lista2, ArrayList<No_Perecederos> lista3){
        
    }
    
    
}
        
        
