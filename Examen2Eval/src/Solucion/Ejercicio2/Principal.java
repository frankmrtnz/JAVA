package Solucion.Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
 public static void main(String[] args) {
   Scanner teclado = new Scanner(System.in);
   ArrayList<Producto> lista = new ArrayList<Producto>();
   Producto p;
   Perecedero pe;
   NoPerecedero np;
   
   lista.add(new Producto("Producto 1",20));
   lista.add(new Perecedero(1,"Producto 2",50));
   lista.add(new NoPerecedero("Limpieza","Producto 3",70));
   lista.add(new Producto("Producto 4",150));
   lista.add(new Perecedero(2,"Producto 5",75));
   lista.add(new NoPerecedero("Conservas","Producto 6",100));
   lista.add(new Producto("Producto 7",40));
   lista.add(new Perecedero(3,"Producto 8",5));
   lista.add(new NoPerecedero("Bebidas","Producto 9",15));
     
   int opc=Menu(teclado);
   while(opc!=5){
       switch(opc){
           case 1:AltaProducto(teclado,lista);
                  break;
           case 2:int pos=BajaProducto(lista,teclado);
                  if(pos==-1)
                    System.out.println("No existe ese producto");
                  else
                     lista.remove(pos);
                  break;
           case 3:System.out.println("El precio de la compra es "+PrecioCompra(lista,teclado));
                  break;
           case 4: for(int i=0;i<lista.size();i++)
                     System.out.println(lista.get(i).toString());
                    break;
           default: System.out.println("Operacion Incorrecta");
                    break;
       }
       opc=Menu(teclado);
   }
  
 }
 static int Menu(Scanner t){
     System.out.println("1. Dar de alta producto"); 
     System.out.println("2. Dar de baja un producto");
     System.out.println("3. Mostrar el precio total de la compra");
     System.out.println("4. Mostrar productos del supermercado");
     System.out.println("5. Salir");
     System.out.println("Escoge una opcion: ");
     int opc=t.nextInt();
     return opc;
 }
 
 static void AltaProducto(Scanner t,ArrayList<Producto> lista){
    int tipo;
    System.out.println("Introducir tipo de producto a dar de alta:\n"
            + "1.Producto General,\n2.Producto Perecedero\n"
            + "3.Procuto No Perecedero");
    tipo=t.nextInt();
    String nombre;
    double precio;
     t.nextLine();
     System.out.println("Introducir nombre del producto");
     nombre=t.nextLine();
     if(existeP(lista,nombre)!=-1)
      System.out.println("El producto ya existe, no se puede dar de alta");
     else{
       System.out.println("Introducir precio");
       precio=t.nextDouble();  
       switch(tipo){
           case 1:Producto p=new Producto(nombre,precio);
                  lista.add(p);
                  break;
           case 2:System.out.println("Introducir dias para caducar");
                  int dias=t.nextInt();
                  Perecedero pe=new Perecedero(dias,nombre,precio);
                  lista.add(pe);
                  break;
           case 3:System.out.println("Tipo de producto(Limpieza,Conservas,....");
                  String tp=t.next();
                  NoPerecedero np=new NoPerecedero(tp,nombre,precio);
                  lista.add(np);
                  break;
           default:System.out.println("Tipo incorrecto");
                  break;
       } 
     }
  }
 static int existeP(ArrayList<Producto> lista,String nombre){
    int existe=-1;
    int i=0;
    while(i<lista.size()&&!lista.get(i).getNombre().equals(nombre))
      i++;
    if (i<lista.size())
      existe=i;
    return existe;
  }
 
 static int BajaProducto(ArrayList<Producto> lista,Scanner t){
     t.nextLine();
     System.out.println("Introducir nombre del producto a dar de baja"); 
     String nombre=t.nextLine();
     int pos=existeP(lista,nombre);
     return pos;
 }
 
 static double PrecioCompra(ArrayList<Producto> lista,Scanner t){
    String resp;
    System.out.println("Desea comprar productos");
    resp=t.next();
    String nombre;
    double total=0;
    t.nextLine();
    while(resp.equalsIgnoreCase("si")){
     System.out.println("Introducir nombre producto a comprar");
     nombre=t.nextLine();
     int pos=existeP(lista,nombre);
     if(pos==-1) 
       System.out.println("Ese producto no existe");
     else{
       System.out.println("Introducir cantidad a comprar");  
       int c=t.nextInt();
       total=total+lista.get(pos).CalcularPrecio(c);
     } 
     System.out.println("Desea comprar mas productos");
     resp=t.next();
     t.nextLine();
    }
     
    return total; 
 }
}
