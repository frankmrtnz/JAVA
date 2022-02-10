
package EjerciciosHoja1.Ejercicio2;


public class Alumno extends Persona implements Hablador{
    
    private String carrera;
    private int curso;

    public Alumno(String nombre, int edad, String carrera, int curso) {
        super(nombre, edad);
        this.carrera = carrera;
        this.curso = curso;
    }

    @Override
    public void hablar() {
        System.out.println("Hola, soy un "+getClass().getSimpleName()+" y se hablar");
        System.out.println("Nombre: "+getNombre()+"   Edad: "+getEdad());
        System.out.println("Carrera: "+this.carrera+"   Curso: "+this.curso);
    }
    
    
    
}
