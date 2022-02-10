
package herencia;

public class Hija extends Padre {     /* Con extends hereda de la clase Padre */
    
    private double atributo3;
    
    public Hija(int at1, String at2, double at3){
        super(at1,at2);   /* Etiqueta para heredar de Padre - Clase Padre */
        this.atributo3=at3;
    }

    public double getAtributo3() {
        return atributo3;
    }

    public void setAtributo3(double atributo3) {
        this.atributo3 = atributo3;
    }

    @Override
    public String toString() {
    return super.toString()+" Hija{" + "atributo3=" + atributo3 + '}';     /* Con el super llamamos a la Herencia */
    }
    
    public void Escribir(){
        System.out.println("atributo3: "+atributo3);
    }
    

}
