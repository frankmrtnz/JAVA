
package EjerciciosHoja1.Ejercicio2;


public class Loro extends Ave implements Hablador{
    
    private String region;
    private String color;

    public Loro(String region, String color, String sexo, int edad) {
        super(sexo, edad);
        this.region = region;
        this.color = color;
    }
    
    @Override
    public void hablar() {
        System.out.println("Hola, soy un "+getClass().getSimpleName()+" y se hablar");
        System.out.println("Sexo: "+getSexo()+"   Edad: "+getEdad());
        System.out.println("Region: "+this.region+"   Color: "+this.color);
    }
    
}
