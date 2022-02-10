
package EjerciciosHoja1.Ejercicio2;


public class Bedel extends Persona implements Hablador{
    
    private String turno;
    private int antiguedad;

    public Bedel(String turno, int antiguedad, String nombre, int edad) {
        super(nombre, edad);
        this.turno = turno;
        this.antiguedad = antiguedad;
    }
    
    @Override
    public void hablar() {
        System.out.println("Hola, soy un "+getClass().getSimpleName()+" y se hablar");
        System.out.println("Nombre: "+getNombre()+"   Edad: "+getEdad());
        System.out.println("Turno: "+this.turno+"   Antiguedad: "+this.antiguedad);
    }
    
}
