
package herencia;

public class Padre {
    
        private int atributo1;
        private String atributo2;

    public Padre(int atributo1, String atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }

    public int getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(int atributo1) {
        this.atributo1 = atributo1;
    }

    public String getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(String atributo2) {
        this.atributo2 = atributo2;
    }

    @Override
    public String toString() {
        return "Padre{" + "atributo1=" + atributo1 + ", atributo2=" + atributo2 + '}';
    }
    
    
    
}
