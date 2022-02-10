/*
ALTERNATIVA MULTIPLE EJEMPLO
 */
package EstructurasdeControl;

import java.util.Scanner;

public class AlternativaMultiple {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        int dia;
        
        System.out.println("Introducir dia de la semana(1 a 7)");
        dia=teclado.nextInt();
        
        if(dia==1){
            System.out.println("Hoy es Lunes");
        }
        else if(dia==2){
            System.out.println("Hoy es Martes");
        }
        else if(dia==3){
            System.out.println("Hoy es Miercoles");
        }
        else if(dia==4){
            System.out.println("Hoy es Jueves");
        }
        else if(dia==5){
            System.out.println("Hoy es Viernes");
        }
        else if(dia==6){
            System.out.println("Hoy es Sabado");
        }
        else if(dia==7){
            System.out.println("Hoy es Domingo");
        }
        else{
            System.out.println("Dia no valido");
        }
        
        
    }
}
