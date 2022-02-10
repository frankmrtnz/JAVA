/*
1 Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese
día.
 */
package ejerciciosiniciales;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String diasemana;
        System.out.println("Introduce dia de la semana (La primera en MAYÚSCULA)");
        diasemana=teclado.next();
        
        switch(diasemana){
            case "Lunes":
            case "Miercoles":
            case "Viernes":System.out.println("Programacion");
                        break;
            case "Martes":System.out.println("Marcas");
                        break;           
            case "Jueves":System.out.println("Bases de Datos");
                        break;           
            case "Sabado":
            case "Domingo":System.out.println("Fin de Semana");
                        break;
            default:System.out.println("Dia erroneo");
                        break;
        }
        
        
    //EJEMPLO CON DÍA NUMÉRICO:

        int diasem;
    
        do{
            System.out.println("Introduce dia de la semana");
            diasem=teclado.nextInt();
        }while(diasem<1 || diasem>7);
    
        switch(diasem){
            case 1:
            case 3:
            case 5:System.out.println("Programacion");
                        break;
            case 2:System.out.println("Marcas");
                        break;           
            case 4:System.out.println("Bases de Datos");
                        break;
            case 6:
            case 7:System.out.println("Fin de Semana");
                        break;
        }
    }
    
}
