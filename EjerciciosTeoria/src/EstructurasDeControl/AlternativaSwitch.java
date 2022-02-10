/*
ALTERNATIVAS SWITCH EJEMPLO
 */
package EstructurasdeControl;

import java.util.Scanner;

public class AlternativaSwitch {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        int dia;
        
        System.out.println("Introducir dia de la semana(1 a 7)");
        dia=teclado.nextInt();
        
        switch(dia){
            case 1:  //Se dejan en blanco estas lineas para que la frase no se repita
            case 2:
            case 4:
            case 5:System.out.println("Dia de Diario");
                break;
            case 3:System.out.println("Mitad de Semana");
                break;
            case 6:
            case 7:System.out.println("Fin de Semana");
                break;
            default:System.out.println("Dia incorrecto");
                break;      
        }
    }
}