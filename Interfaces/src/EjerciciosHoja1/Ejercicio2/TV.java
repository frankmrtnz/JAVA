
package EjerciciosHoja1.Ejercicio2;


public class TV extends Aparato implements Hablador{
    
    private boolean teletexto;
    private int antiguedad;

    public TV(boolean teletexto, int antiguedad, String consumo, int precio) {
        super(consumo, precio);
        this.teletexto = teletexto;
        this.antiguedad = antiguedad;
    }
    
    @Override
    public void hablar() {
        System.out.println("Hola, soy un "+getClass().getSimpleName()+" y se hablar");
        System.out.println("Consumo: "+getConsumo()+"   Precio: "+getPrecio());
        System.out.println("Teletexto: "+this.teletexto+"   Antiguedad: "+this.antiguedad);
    }
    
}
