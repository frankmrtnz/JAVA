/*clase: caracteristicas del mundo real y 
vamos a definir valores de ese mundo
Ej: clase alumno
-cada alumno es un objeto de la clase 
alumno
-defino lo que quiero saber: dni, 
notas nombres, apellidos: son atributos 
(*puede tener o no, en principio si. Si no le
ponemos nada coge un atributo "protec",
nuestros atributos deben ser privados y solo
puedes hacer referencia a ellos desde la clase
alumno a traves de metodos)
-luego tengo q operaciones pueden hacer:
puede matricularse, hacer examenes, poner
falta...
-** (puede tener o no y si no tiene coge uno
por defecto, metodo especial q se tiene q 
llamar igual q la clase(?))
-***objeto clase alumno, el constructor 
recibe los 3 parametros
-metodos: cada uno que puede hacer mi alumno
 */
package iniciacionpoo;

public class Alumno {
    
    //ATRIBUTOS* 
    private int Nmat;               /*  Elemento con private solo es accesible desde la clase  */
    private String Nombre;
    private String curso;
    private double[] nota=new double[3];
    
    
    //CONSTRUCTORES**
    Alumno(int Nmat,String Nombre/*,double nota*/){ //***
      this.Nmat=Nmat;
      this.Nombre=Nombre;
      //this.nota=nota;        
    }
    
    Alumno(int Nmat){
      this.Nmat=Nmat;
    }
    
    Alumno(){}
      //Nmat=99999999;
      //Nombre="Vacio";
      //de nota coge por defecto 0.0
    
    //METODOS
    
    void Matricularse(String curso){
      //System.out.println("El alumno "+this.Nmat+" se ha matriculado en "+curso);
      this.curso=curso;
    }
    
    void PonerNota(double n1,double n2,double n3){
        this.nota[0]=n1;
        this.nota[1]=n2;
        this.nota[2]=n3;
    }
    
    double CalcularMedia(){
       double media=0;
       for(int i=0;i<nota.length;i++)
         media=media+nota[i];
       media=media/nota.length;
       return media;
    }

    /* public String toString(){
    return "Matricula "+Nmat+" Nombre "+Nombre+" Curso "+curso+" Nota "+nota;
    }*/

    @Override
    public String toString() {
        return "Alumno{" + "Nmat=" + Nmat + ", Nombre=" + Nombre + ", curso=" + curso + ", notas=" + nota[0] +" "+nota[1]+" "+nota[2]+" Media "+CalcularMedia()+ '}';
    }

    // METODO GETTER (devolver)
    public int getNmat() {
        return Nmat;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getCurso() {
        return curso;
    }
    public double[] getNota() {
        return nota;
    }

    // METODO SETTER (modificar)
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setNota(double[] nota) {
        this.nota = nota;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
    
     
    
    
}
