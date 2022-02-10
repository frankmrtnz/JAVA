
package EjerciciosTeoria.Persona;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);

    Persona p1,p2,p3;
    String nombre;
    int edad, altura;
    char sexo;
    
    System.out.println("Introduce nombre");
    nombre=teclado.nextLine();
    System.out.println("Introducir edad");
    edad=teclado.nextInt();
    System.out.println("Introducir altura");
    altura=teclado.nextInt();
    System.out.println("Introducir sexo");
    sexo=teclado.next().charAt(0);
    
    p1=new Persona(nombre,edad,altura,sexo);   // Creo el objeto con todos los parametros
    
    teclado.nextLine();
    
    System.out.println("Introduce nombre");
    nombre=teclado.nextLine();
    System.out.println("Introducir edad");
    edad=teclado.nextInt();
    System.out.println("Introducir sexo");
    sexo=teclado.next().charAt(0);
    
    p2=new Persona(nombre,edad,sexo);      // Creo el objeto con 3 parametros
    
    p3=new Persona();   // Creo el objeto por defecto
    
    if(p1.esMayorDeEdad())
        System.out.println("La primera persona es mayor de edad");
    else 
        System.out.println("La primera persona NO es mayor de edad");
    
    if(p2.esMayorDeEdad())
        System.out.println("La segunda persona es mayor de edad");
    else 
        System.out.println("La segunda persona NO es mayor de edad");
    
    if(p3.esMayorDeEdad())
        System.out.println("La tercera persona es mayor de edad");
    else 
        System.out.println("La tercera persona NO es mayor de edad");
    
    System.out.println(p1.toString());
    System.out.println(p2.toString());
    System.out.println(p3.toString());
    
    }
}
