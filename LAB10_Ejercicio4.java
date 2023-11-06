package jva.edu.lab10;
import java.util.Scanner;
/*@author SERGIO ARELLANO */
public class LAB10_Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
  /*4. Desarrolla un programa para N estudiantes que permita leer sus notas obtenidas en el curso de 
 algoritmos. Se sabe que la minima nota aprobatoria es 13. Al final calcule:
            a)La mayor nota
            b)La menor nota
            c)El promedio de notas del salón
            d)La cantidad de alumnos aprobados
            e)La cantidad de alumnos desaprobados
            f)El porcentaje de alumnos aprobados
            g)El porcentaje de alumnos desaprobados. */   
         
   int notaMayor=0,notaMenor=0,nAprobados=0,nDesaprobados=0,sumaNotas=0; 
    System.out.println("Ingresar cantidad  de alumnos:");
        int cantidadStudents=sc.nextInt();
        
         for (int i=1;i<=cantidadStudents;i++)
            {System.out.println("Nota n° "+i+":");
             int nota=sc.nextInt();
            //Nota mayor y menor
             if (i==1)
             {notaMenor=nota;notaMayor=nota;}    
            else if (nota>notaMayor)  
             { notaMayor=nota;}
             if (nota<notaMayor)
             {notaMenor=nota;} 
            //acumulador de notas para promedio  
             sumaNotas=sumaNotas+nota;
            //Cantidad de alumnos aprobados y desaprobados
            if (nota>=13)
            {nAprobados=nAprobados+1;}
                else {nDesaprobados=nDesaprobados+1;}
          }//fin for    
                 //Procesos de datos del for
             //Promedio
             double promedio=(double)sumaNotas/(double)cantidadStudents;
             //Porcentaje aprobados
             double porcentajeAprobados=(nAprobados*100)/cantidadStudents;
             double porcentajeDesaprobados=(nDesaprobados*100)/cantidadStudents;
             
         //Salida de datos    
            System.out.println("Nota mayor: "+notaMayor);
            System.out.println("Nota menor: "+notaMenor);
            System.out.println("Promedio general: "+promedio);
            System.out.println("Porcentaje aprobados: "+porcentajeAprobados+"%");
            System.out.println("Porcentaje desaprobados: "+porcentajeDesaprobados+"%");
  
    }
}
