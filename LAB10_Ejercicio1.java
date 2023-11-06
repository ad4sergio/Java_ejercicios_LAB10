package jva.edu.lab10;
import java.util.Scanner;

/*@author SERGIO ARELLANO */

public class LAB10_Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
 /* 1.Ingresar N edades desde teclado, el programa debe calcular la cantidad y promedio de personas
        menores y mayores de edad.  */    
        int mayoresEdad=0, menoresEdad=0,edadesMayores=0,edadesMenores=0;
        double promedioMayores,promedioMenores;
        System.out.println("Ingresar cantidad  de personas:");
        int cantidad=sc.nextInt();
        
        for (int i=1;i<=cantidad;i++)
            {System.out.println("Edad n° "+i+":");
            int edad=sc.nextInt();
            if (edad>18)
            {mayoresEdad=mayoresEdad+1;
            edadesMayores=edadesMayores+edad;}
            else 
            {menoresEdad=menoresEdad+1 ;
            edadesMenores=edadesMenores+edad;}
             }//fin for
        
        promedioMayores=edadesMayores/mayoresEdad;
        promedioMenores=edadesMenores/menoresEdad;
         System.out.println("Datos:");
         System.out.println("Cantidad de mayores de edad: "+mayoresEdad);
         System.out.println("Promedio de edades (+18): "+promedioMayores);
         System.out.println("Cantidad de menores de edad: "+menoresEdad);
         System.out.println("Promedio de edades (-18): "+promedioMenores);  
    }
}
