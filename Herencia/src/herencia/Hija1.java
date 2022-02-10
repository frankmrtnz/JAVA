
package herencia;

public class Hija1 extends Hija {
    
    private boolean valor;
    
    public Hija1(boolean valor, int atributo1, String atributo2, double atributo3){
        super(atributo1, atributo2, atributo3);
        this.valor=valor;
    }

    public boolean isValor() {
        return valor;
    }

    public void setValor(boolean valor) {
        this.valor = valor;
    }
    
    public void Imprimir(){
        System.out.println("Atributo valor: "+valor);
    }
    
}
