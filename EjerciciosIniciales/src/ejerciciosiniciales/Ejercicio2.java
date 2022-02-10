/*
2 Realizar un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes o buenas
noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5 respectivamente. Sólo se tienen en
cuenta las horas, los minutos no se deben introducir por teclado.
 */
package ejerciciosiniciales;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int hora;
        
        do{
            System.out.println("Introducir hora entre 0 y 23");
            hora=teclado.nextInt();
        }while(hora<0 || hora>23);
        
        if(hora>=6 && hora<=12)
            System.out.println("BUENOS DÍAS");        
        else if(hora>=13 && hora<=20)
            System.out.println("BUENAS TARDES");        
        else System.out.println("BUENAS NOCHES");

        //En el caso que hubiera sido asi: 0-7, 8-16, 17-23 podríamos haber hecho lo siguiente
        if(hora<=7)
            System.out.println("Buenos Dias");
        else if(hora<=16)
            System.out.println("Buenas Tardes");
        else System.out.println("Buenas Noches");
        
        
    }    
}
