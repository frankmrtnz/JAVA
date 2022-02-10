
package EjerciciosHoja2.Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaFiguras {
  public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       ArrayList<Figura> lista=new ArrayList<Figura>();
       
       /*Rectangulo r=new Rectangulo(7,10);
       Cuadrado c=new Cuadrado(6);
       //   Triangulo t=new Triangulo(5,4); NO PUEDE SER PORQUE
       //                         LA CLASE TRIANGULO ES ABSTRACTA
       TrianguloRectangulo tr=new TrianguloRectangulo(5);
       
       System.out.println(r.toString());
       System.out.println(r.NombreFigura());
       System.out.println(r.Area());
       System.out.println(r.Perimetro());
       r.dibujarTxt();
       System.out.println("--------------------------------");
       System.out.println(c.toString());
       System.out.println(c.NombreFigura());
       System.out.println(c.Area());
       System.out.println(c.Perimetro());
       c.dibujarTxt();
       System.out.println("--------------------------------");
       System.out.println(tr.toString());
       System.out.println(tr.NombreFigura());
       System.out.println(tr.Area());
       System.out.println(tr.Perimetro());
       tr.dibujarTxt();*/
       int operacion,cateto,lado;
       operacion=Menu(teclado);
       while(operacion!=6){
          switch(operacion){
              case 1:CrearRectangulo(teclado,lista);
                     break;
              case 2:System.out.println("Introducir lado del cuadrado");
                     lado=teclado.nextInt();
                     Cuadrado c=new Cuadrado(lado);
                     lista.add(c);
                     break;
              case 3:System.out.println("Introducir cateto del triangulo");
                     cateto=teclado.nextInt();
                     TrianguloRectangulo tr=new TrianguloRectangulo(cateto);
                     lista.add(tr);
                     break;
              case 4:if(lista.size()==0)
                       System.out.println("No tiene figuras a mostrar");
                     else{
                       System.out.println(lista.get(lista.size()-1).toString());
                       System.out.println(lista.get(lista.size()-1).NombreFigura());
                       System.out.println(lista.get(lista.size()-1).Area());
                       System.out.println(lista.get(lista.size()-1).Perimetro());
                       lista.get(lista.size()-1).dibujarTxt();
                     }
                     break;
              case 5: for(int i=0;i<lista.size();i++){
                       System.out.println(lista.get(i).toString());
                       System.out.println(lista.get(i).NombreFigura());
                       System.out.println(lista.get(i).Area());
                       System.out.println(lista.get(i).Perimetro());
                       lista.get(i).dibujarTxt();
                      }
                      break;    
              default:System.out.println("Operacion incorrecta");
                      break;
          }
          operacion=Menu(teclado);
       }
    }
  
    static int Menu(Scanner t){
      int opc=0;
      System.out.println("1. Crear rectángulo");
      System.out.println("2. Crear cuadrado");
      System.out.println("3. Crear triángulo rectangulo");
      System.out.println("4. Ver figura");
      System.out.println("5. Mostrar todas las figuras");
      System.out.println("6. Salir");
      System.out.println("Escoge una opcion");
      opc=t.nextInt();
      return opc;
    }
    public static void CrearRectangulo(Scanner t,ArrayList<Figura> l){
       int altura,base;
       System.out.println("Introducir altura del rectangulo");
       altura=t.nextInt();
       System.out.println("Introducir base del rectangulo");
       base=t.nextInt();
       Rectangulo r=new Rectangulo(altura,base);
       l.add(r);
    }
}