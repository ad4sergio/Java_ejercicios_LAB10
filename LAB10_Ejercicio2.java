package jva.edu.lab10;
import java.util.Scanner;
/*@author SERGIO ARELLANO */
public class LAB10_Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
  /* 2.Ingresar promedio final del curso de algoritmo de N alumnos desde teclado. El programa debe calcular 
    la cantidad de alumnos pésimo,malo,regular,bueno y excelente, conforme ala siguiente tabla.
            Promedio         Característica
            0-5                  Pésimo
            6-12                Malo
            13-14              Regular 
            15-17              Bueno
            18-20              Excelente  */
  int nPesimo=0,nMalo=0,nRegular=0,nBueno=0,nExcelente=0;      
  System.out.println("Ingresar cantidad  de alumnos:");
        int cantidadAlumnos=sc.nextInt();
         for (int i=1;i<=cantidadAlumnos;i++)
            {System.out.println("Nota n° "+i+":");
             int nota=sc.nextInt();
             if(nota>=0 && nota<=5)
             {nPesimo=nPesimo+1;}
             if(nota>=6 && nota<=12)
             {nMalo=nMalo+1;}
             if(nota>=13 && nota<=14)
             {nRegular=nRegular+1;}
             if(nota>=15 && nota<=17)
             {nBueno=nBueno+1;}
             if(nota>=18 && nota<=20)
             {nExcelente=nExcelente+1;}        
                }//fin for
         System.out.println("Cantidad en pésimo: "+nPesimo);             
         System.out.println("Cantidad en malo: "+nMalo);
         System.out.println("Cantidad en regular: "+nRegular); 
         System.out.println("Cantidad en bueno: "+nBueno);
         System.out.println("Cantidad en excelente: "+nExcelente);        
    }
    
}
