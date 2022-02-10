/*
4 Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las horas ordinarias
(40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.
 */
package ejerciciosiniciales;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int horas,extras,resultado1,resultado2;
        
        System.out.println("Introducir horas de trabajo semanal");
        horas=teclado.nextInt();
        extras=horas-40;
        resultado1=40*12;
        resultado2=resultado1+(extras*16);
        if(horas<41)
            System.out.println("Tu salario semanal será: "+horas+" * "+12+" = "+(horas*12)+"€");
        else                      
            System.out.println("Tu salario semanal será: (40*12) + ("+extras+"*"+16+") = "+resultado2+"€");
        
    }
    
}
