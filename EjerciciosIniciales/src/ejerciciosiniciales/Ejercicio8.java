/*
8 Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos que faltan para
 llegar a la medianoche
 */
package ejerciciosiniciales;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int hora,minutos,segundos;
        
        do{
            System.out.println("Escribe la hora (Formato 23h)");
            hora=teclado.nextInt();
        }while(hora<0 || hora>23);
                
        do{
            System.out.println("Escribe los minutos (Formato 59mins)");
            minutos=teclado.nextInt();
        }while(minutos<0 || minutos>59);        
        
        segundos=24*3600-hora*3600-minutos*60;
        System.out.println("Desde las "+hora+":"+minutos+" hasta la medianoche quedan "+segundos+" segundos.");
    }    
}
