/*
Otro ejemplo de cadenas de String (objeto)
*/

package strings;
public class CadenaB {
    public static void main(String[] args) {
        
        String cadena="Hoy es martes";
        String cadena1=new String("Mañana es miercoles");
        
        System.out.println(cadena+" ("+cadena.length()+"). "+cadena1+" ("+cadena1.length()+"). ");
        System.out.println(cadena.substring(0,3));
        System.out.println(cadena.substring(6));
        
        
        String cadena2="hola";
        String cadena3="Hola";
        System.out.println(cadena3.compareTo(cadena2));   /* Cuando me devuelve un numero menor que 0 la primera cadena es menor en nº de caracteres ASCII  */
        
        
        
        
    }
}
