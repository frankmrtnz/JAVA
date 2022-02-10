/*
10.- Escribe un programa que le solicite al usuario ingresar una fecha formada
por 8 números, donde los primeros dos representan el día, los siguientes dos el
mes y los últimos cuatro el año (DDMMAAAA). Este dato debe guardarse en
una variable con tipo int (número entero). Finalmente, mostrar al usuario la
fecha con el formato DD / MM / AAAA.
 */
package ejerciciosteoria;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        int fecha,dia,mes,anio;
        System.out.println("Introducir fecha en formato DDMMAAAA");
        fecha=teclado.nextInt();
        dia=fecha/1000000;
        fecha=fecha%1000000;
        mes=fecha/10000;
        anio=fecha%10000;
        
        System.out.println(dia+"/"+mes+"/"+anio);
  
    }
    
}
