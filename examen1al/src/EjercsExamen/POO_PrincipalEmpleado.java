
package EjercsExamen;

import java.util.ArrayList;
import java.util.Scanner;

public class POO_PrincipalEmpleado {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<POO_Monedero> lista = new ArrayList<POO_Monedero>();
        POO_Monedero m;
        
        Inicializar(lista, 5);
        MostrarMonederos(lista);

        int operacion = Menu(teclado);
        
        while (operacion != 7){
            System.out.println("Ha elegido la opción "+operacion);
            
            switch(operacion){
                case 1: AñadirMonedero(teclado, lista); 
                    break;
                case 2: IngresarDinero(teclado, lista); 
                    break;
                case 3: SacarDinero(teclado, lista);
                    break;
                case 4: PrestarDinero(teclado, lista);
                    break; 
                case 5: MostrarSaldo(teclado, lista);
                    break;  
                case 6: MostrarMonederos(lista);
                    break;
                default: System.out.println("Operacion incorrecta");    // Se puede hacer tmb con un do while en la clase Menu()
                break;
            }            
            operacion = Menu(teclado);
        }
            

    }     // CIERRA EL psvm
    
    
    public static void Inicializar(ArrayList<POO_Monedero> lista, int num){
        POO_Monedero m;
        for (int i=1; i<=5; i++){
            m = new POO_Monedero(100*i, Math.random()*1000);
            lista.add(m);
        }
    }
    
    public static void MostrarMonederos(ArrayList<POO_Monedero> lista){
        for (int i=0; i<lista.size(); i++)
            System.out.println(lista.get(i).toString());
    }
    
    public static int Menu(Scanner t){
        int opc;
        System.out.println("\n -------------------------------- \n");
        System.out.println("1. AÑADIR MONEDERO");
        System.out.println("2. INGRESAR DINERO");
        System.out.println("3. SACAR DINERO");
        System.out.println("4. PRESTAR DINERO");
        System.out.println("5. MOSTRAR SALDO");
        System.out.println("6. MOSTRAR TODOS LOS MONEDEROS");
        System.out.println("7. SALIR");
        System.out.println("INTRODUCE OPCION:");
        opc = t.nextInt();
        return opc;
    }
    
    public static void AñadirMonedero(Scanner t, ArrayList<POO_Monedero> lista){
        int id;     // Estas 2 variables, al igual que todas, solo existen cuando se llama al método en el que estan
        double dinero;
        
        System.out.println("Introducir id del nuevo monedero");
        id = t.nextInt();
        
        if(Buscar(id, lista) == -1){
            System.out.println("Introducir el dinero del nuevo monedero");
            dinero = t.nextDouble();
            lista.add(new POO_Monedero(id, dinero));
        }else
            System.out.println("No se puede añadir, pues el id ya existe");
    }
    
    public static int Buscar(int id, ArrayList<POO_Monedero> lista){        
        int i = 0, pos = -1;
        
        while(i < lista.size() && lista.get(i).getId() != id)
            i++;
        if(i < lista.size())
            pos = i;
        
        return pos;
    }
    
    public static void MostrarSaldo(Scanner t, ArrayList<POO_Monedero> lista){
        int id;     
        
        System.out.println("Introducir id del monedero a mostrar su saldo");
        id = t.nextInt();
        
        int pos = Buscar(id, lista);
        
        if(pos != -1){
            System.out.println(lista.get(pos).toString());
        }else
            System.out.println("No se puede mostrar, pues el id no existe");     
    }
    
    public static void IngresarDinero(Scanner t, ArrayList<POO_Monedero> lista){
        int id;
        double dinero;
        
        System.out.println("Introducir id del monedero a ingresar dinero");
        id = t.nextInt();
        
        int pos = Buscar(id, lista);
        
        if(pos != -1){
            System.out.println("Introducir cantidad a ingresar");
            dinero = t.nextDouble();
            lista.get(pos).Ingresar(dinero);
            System.out.println("Ahora tiene "+lista.get(pos).getSaldo()+" euros");
        }else
            System.out.println("No se puede ingresar, pues el id no existe");
    }
    
    public static void SacarDinero(Scanner t, ArrayList<POO_Monedero> lista){
        int id;
        double dinero;
        
        System.out.println("Introducir id del monedero a sacar dinero");
        id = t.nextInt();
        
        int pos = Buscar(id, lista);
        
        if(pos != -1){
            System.out.println("Introducir cantidad a sacar");
            dinero = t.nextDouble();
            if(lista.get(pos).Sacar(dinero)){
                System.out.println("La extracción de dinero se ha realizado con éxito");
                System.out.println("Le queda "+lista.get(pos).getSaldo()+" euros");
            }
        }else
            System.out.println("No se puede sacar, pues el id no existe");
    }
    
    public static void PrestarDinero(Scanner t, ArrayList<POO_Monedero> lista){
        int id, pos1, pos2;
        double dinero;
        
        System.out.println("Introducir id del monedero que presta");
        id = t.nextInt();
        
        pos1 = Buscar(id, lista);
        
        if(pos1 != -1){
            System.out.println("Introducir id del monedero que recibe el presta");
            id = t.nextInt();
            pos2 = Buscar(id, lista);
            if(pos2 != -1){
                System.out.println("Introducir la cantidad a prestar");
                dinero = t.nextDouble();
                lista.get(pos1).Prestar(lista.get(pos2), dinero);
// OTRA OPCIÓN a la última linea: Monedero.Prestar(lista.get(pos1), lista.get(pos2), dinero);
            }else
                System.out.println("No se puede prestar, pues el id no existe");
        }else    
            System.out.println("No puede prestar, pues el id no existe");
    }
    
}      // CIERRA LA CLASE Principal

