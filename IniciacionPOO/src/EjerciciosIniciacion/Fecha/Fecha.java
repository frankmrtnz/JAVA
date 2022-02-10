
package EjerciciosIniciacion.Fecha;

public class Fecha {

    int dia, mes, anio;
    
    Fecha(){    /*  Constructor por defecto  */
        this.dia=1;
        this.mes=1;
        this.anio=1900;
    }
    
    
    Fecha(int dia, int mes, int anio){
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }
    
    
    boolean bisiesto(){
        boolean resp=false;
        
        if(this.anio%4==0){
            if(this.anio%100==0){
                if(this.anio%400==0){
                    System.out.println("El año "+this.anio+" es bisiesto");
                    resp=true;
                }else{
                    System.out.println("El año "+this.anio+" NO es bisiesto");
                 }
            }else{
                System.out.println("El año "+this.anio+" es bisiesto");
                resp=true;
            }
        }else{
            System.out.println("El año "+this.anio+" NO es bisiesto");
        }
        return resp;
    }
    
    
    boolean bisiesto(int anio){     /* Lo usaremos para el método diasTranscurridos() más abajo para saber si son bisiesto o no e ir sumando */
        boolean resp=false;
        
        if(this.anio%4==0){
            if(this.anio%100==0){
                if(this.anio%400==0){
                    resp=true;
                }
            }else{
                resp=true;
            }
        }
        return resp;
    }
    
    
    int diasMes(int mes){
        int dias=0;
        
        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: dias=31;
                     break;
            case 4:
            case 6:
            case 9:
            case 11: dias=30;
                     break;
            case 2: if(bisiesto())
                        dias=29;
                    else
                        dias=28;
        }
            
        return dias;
    }
    
    
    void valida(){
        if(this.anio<1900 || this.anio>2050)
            this.anio=1900;
        
        if(this.mes<1 || this.mes>12)
            this.mes=1;
        
        if(this.dia<1 || this.dia>diasMes(this.mes))
            this.dia=1;
    }

    
    void corta(){
        String dia="0";
        String mes="0";
        
        if(this.dia<10)
            dia=dia+this.dia;
        else
            dia=""+this.dia;
        
        if(this.mes<10)
            mes=mes+this.mes;
        else
            mes=""+this.mes;
        System.out.println(dia+"-"+mes+"-"+this.anio);
    }
    
    
    void anterior(){
        if(this.mes==1){
            if(this.dia==1){
                this.mes=12;
                this.anio=this.anio-1;
                this.dia=diasMes(this.mes);
            }else{
                this.dia=this.dia-1;
            }
        }else if(this.dia==1){
            this.mes=this.mes-1;
            this.dia=diasMes(this.mes);
        }else 
            this.dia=this.dia-1;
        System.out.println(this.dia+" "+this.mes+" "+this.anio);
    }
    
    
    void igualQue(Fecha f){
        if(this.dia==f.dia && this.mes==f.mes && this.anio==f.anio)
            System.out.println("Las fechas son iguales");
        else
            System.out.println("Las fechas no son iguales");
    }
    
    void menorQue(Fecha f){    /*  FALTA HACER!!!!  */
        boolean menor=false;
        
        if(this.anio<f.anio){
            menor=true;
        }    
        if(this.anio>=f.anio && this.mes<f.mes){
            menor=true;
        }
        if(this.anio>=f.anio && this.mes>=f.mes && this.dia<f.dia){
            menor=true;
        }
        
        if(menor){
            System.out.print("La fecha ");
            corta();
            System.out.print("es menor que ");
            f.corta();
        }else{
            System.out.print("La fecha ");
            corta();
            System.out.print("no es menor que ");
            f.corta();
        }
    }
    
    
    void mayorQue(Fecha f){
        boolean mayor=false;
        if(this.anio>f.anio)
            mayor=true;
        else if(this.mes>f.mes)
            mayor=true;
        else if(this.dia>f.dia)
            mayor=true;
        if(mayor){
            System.out.print("La fecha ");
            corta();
            System.out.print("es mayor que ");
            f.corta();
        }else{
            System.out.print("La fecha ");
            corta();
            System.out.print("no es mayor que ");
            f.corta();
        }
    }
    
    
    /*    @Override
    public String toString() {
    return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }   */
    
    
    int diasTranscurridos(){
        int dias=0;
        
        for (int i=1900; i<this.anio; i++)
            if(bisiesto(i))
                dias=dias+366;
            else
                dias=dias+365;
        
        for (int i=1; i<this.mes; i++)
            dias=dias+diasMes(i);
        
        dias=dias+this.dia;    
        
        return dias;
    }
    
    
    String diaSemana(){
        String[] dia = {"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};    /*   Hacemos un array para definir el dia de la semana  */
        int a=(14-this.mes)/12;
        int y=this.anio-a;
        int m=this.mes+12*a-2;
        int d=(this.dia+y+y/4-y/100+y/400+31*m/12)%7;
        
        return dia[d];
    }
    
    
    void larga(){
        String[] mes = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre"
                ,"Octubre","Noviembre","Diciembre"};
        
        System.out.println(diaSemana()+" "+this.dia+" de "+mes[this.mes-1]+" de "+this.anio);
    } 
    
    
    int diasEntre(Fecha f){    /* desde fecha mas cercana hasta 1900 y desde la lejana hasta 1900 y hacemos la diferencia */
        int dias=0;
        
        dias=diasTranscurridos()-f.diasTranscurridos();
        
        if(dias<0)
            dias=dias*(-1);
        
        return dias;
    }
    
    
    void siguiente(){
        if(this.dia<diasMes(this.mes))
            this.dia++;
        else{
            this.dia=1;
            if(this.mes<12)
                this.mes++;
            else{
                this.mes=1;
                this.anio++;
            }
        }
        System.out.println(dia+" "+mes+" "+anio);
    }
    
    
}
