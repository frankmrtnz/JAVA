/*
EJERCICIO 3 - EXAMEN - Francisco Martinez Martin - 1DAW
 */

package examen;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int numero, suma1, suma2, suma3, suma4, re1, re11, re2, re22, re3, re33, re4, re44;
        int aux1,aux2,aux3,aux4,aux5,aux6,aux7,aux8,aux9;
        do{
            System.out.println("Introduce numero (entre 6 y 9 digitos)");
            numero=teclado.nextInt();
        }while(numero<99999 || numero>1000000000);
        
        
        // De 6 digitos
        if(numero<1000000 && numero>99999){
            aux1=numero%10;
            System.out.print(aux1+"");
            aux2=(numero%100)/10;
            System.out.print(aux2+"");
            aux3=(numero%1000)/100;
            System.out.print(aux3+"");
            aux4=(numero%10000)/1000;
            System.out.print(aux4+"");
            aux5=(numero%100000)/10000;
            System.out.print(aux5+"");
            aux6=(numero%1000000)/100000;
            System.out.print(aux6+"");
            System.out.println();
            suma1=(aux1*2)+(aux2*3)+(aux3*4)+(aux4*5)+(aux5*6)+(aux6*7);
            System.out.print(aux1+"*2 + "+aux2+"*3 + "+aux3+"*4 + "+aux4+"*5 + "+aux5+"*6 + "+aux6+"*7 = "+suma1);
            System.out.println();
            System.out.println(suma1+"%11 = "+suma1%11);
            re1=suma1%11;
            System.out.println(re1+"-8 = "+(re1-8));
            re11=re1-8;
            System.out.println(numero+"-"+re11+" = "+(numero-re11));
        }
        
        
        
        
        // De 7 digitos
        if(numero<10000000 && numero>999999){
            aux1=numero%10;
            System.out.print(aux1+"");
            aux2=(numero%100)/10;
            System.out.print(aux2+"");
            aux3=(numero%1000)/100;
            System.out.print(aux3+"");
            aux4=(numero%10000)/1000;
            System.out.print(aux4+"");
            aux5=(numero%100000)/10000;
            System.out.print(aux5+"");
            aux6=(numero%1000000)/100000;
            System.out.print(aux6+"");
            aux7=(numero%10000000)/1000000;
            System.out.print(aux7+"");
            System.out.println();
            suma2=(aux1*2)+(aux2*3)+(aux3*4)+(aux4*5)+(aux5*6)+(aux6*7)+(aux7*2);
            System.out.print(aux1+"*2 + "+aux2+"*3 + "+aux3+"*4 + "+aux4+"*5 + "+aux5+"*6 + "+aux6+"*7 + "+aux7+"*2 = "+suma2);
            System.out.println();
            System.out.println(suma2+"%11 = "+suma2%11);
            re2=suma2%11;
            System.out.println(re2+"-8 = "+(re2-8));
            re22=re2-8;
            System.out.println(numero+"-"+re22+" = "+(numero-re22));
        }
        
        // De 8 digitos
        if(numero<100000000 && numero>9999999){
            aux1=numero%10;
            System.out.print(aux1+"");
            aux2=(numero%100)/10;
            System.out.print(aux2+"");
            aux3=(numero%1000)/100;
            System.out.print(aux3+"");
            aux4=(numero%10000)/1000;
            System.out.print(aux4+"");
            aux5=(numero%100000)/10000;
            System.out.print(aux5+"");
            aux6=(numero%1000000)/100000;
            System.out.print(aux6+"");
            aux7=(numero%10000000)/1000000;
            System.out.print(aux7+"");
            aux8=(numero%100000000)/10000000;
            System.out.print(aux8+"");
            System.out.println();
            suma3=(aux1*2)+(aux2*3)+(aux3*4)+(aux4*5)+(aux5*6)+(aux6*7)+(aux7*2)+(aux8*3);
            System.out.print(aux1+"*2 + "+aux2+"*3 + "+aux3+"*4 + "+aux4+"*5 + "+aux5+"*6 + "+aux6+"*7 + "+aux7+"*2 + "+aux8+"*3 = "+suma3);
            System.out.println();
            System.out.println(suma3+"%11 = "+suma3%11);
            re3=suma3%11;
            System.out.println(re3+"-8 = "+(re3-8));
            re33=re3-8;
            System.out.println(numero+"-"+re33+" = "+(numero-re33));
        }
        
        // De 9 digitos
        if(numero<1000000000 && numero>99999999){
            aux1=numero%10;
            System.out.print(aux1+"");
            aux2=(numero%100)/10;
            System.out.print(aux2+"");
            aux3=(numero%1000)/100;
            System.out.print(aux3+"");
            aux4=(numero%10000)/1000;
            System.out.print(aux4+"");
            aux5=(numero%100000)/10000;
            System.out.print(aux5+"");
            aux6=(numero%1000000)/100000;
            System.out.print(aux6+"");
            aux7=(numero%10000000)/1000000;
            System.out.print(aux7+"");
            aux8=(numero%100000000)/10000000;
            System.out.print(aux8+"");
            aux9=(numero%1000000000)/100000000;
            System.out.print(aux9+"");
            System.out.println();
            suma4=(aux1*2)+(aux2*3)+(aux3*4)+(aux4*5)+(aux5*6)+(aux6*7)+(aux7*2)+(aux8*3)+(aux9*4);
            System.out.print(aux1+"*2 + "+aux2+"*3 + "+aux3+"*4 + "+aux4+"*5 + "+aux5+"*6 + "+aux6+"*7 + "+aux7+"*2 + "+aux8+"*3 + "+aux9+"*4 = "+suma4);
            System.out.println();
            System.out.println(suma4+"%11 = "+suma4%11);
            re4=suma4%11;
            System.out.println(re4+"-8 = "+(re4-8));
            re44=re4-8;
            System.out.println(numero+"-"+re44+" = "+(numero-re44));
        }
        
        
        
    }    
}
