
package EjerciciosHoja1.Ejercicio2;


public class Radio extends Aparato implements Hablador{
    
    private boolean cassette;
    private int potencia;

    public Radio(boolean cassette, int potencia, String consumo, int precio) {
        super(consumo, precio);
        this.cassette = cassette;
        this.potencia = potencia;
    }
    
    @Override
    public void hablar() {
        System.out.println("Hola, soy un "+getClass().getSimpleName()+" y se hablar");
        System.out.println("Consumo: "+getConsumo()+"   Precio: "+getPrecio());
        System.out.println("Cassette: "+this.cassette+"   Potencia: "+this.potencia);
    }
    
}
