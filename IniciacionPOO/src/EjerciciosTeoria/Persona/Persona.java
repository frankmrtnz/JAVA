
package EjerciciosTeoria.Persona;

public class Persona {
        
    String nombre, DNI;
    int edad, altura;
    char sexo;
    
    Persona(){
        nombre="";
        edad=0;
        altura=0;
        DNI=generarDni();
        sexo='H';
    }
    
    Persona(String nombre, int edad, char sexo){
        this.nombre=nombre;
        this.edad=edad;
        comprobarSexo(sexo);
        altura=0;
        DNI=generarDni();
    }
    
    Persona(String nombre, int edad, int altura, char sexo){
        this.nombre=nombre;
        this.edad=edad;
        comprobarSexo(sexo);
        altura=0;
        DNI=generarDni();
    }
    
    String generarDni(){
        char[] letra={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int dni=(int)(Math.random()*90000000+10000000);
        return dni+"-"+letra[dni%23];
    }
    
    void comprobarSexo(char sexo){
        if (sexo=='H' || sexo=='M')
            this.sexo=sexo;
        else
            this.sexo='H';
    }
    
    boolean esMayorDeEdad(){
        boolean respuesta=true;
        if(edad<18)
            respuesta=false;
        return respuesta;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", DNI=" + DNI + ", edad=" + edad + ", altura=" + altura + ", sexo=" + sexo + '}';
    }
    

}
