/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasakhirjava;

import java.util.Scanner;

public class TugasAkhirJava {

      public static void main(String[] args){
    Scanner inputan=new Scanner(System.in);
        int A[][]=new int[2][2];
        int B[][]=new int[2][2];
        int C[][]=new int[2][2];
        
        System.out.println("Masukan Nilai Matriks X");
        System.out.println("=======================");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print("[" +(i+1)+"]["+(j+1)+"]:");
                A[i][j]=inputan.nextInt();
            }
        }
        System.out.println("Masukan Nilai Matriks Y");
        System.out.println("=======================");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print("[" +(i+1)+"]["+(j+1)+"]:");
                B[i][j]=inputan.nextInt();
            }
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        System.out.println("\nHasil Penjumlahan Matriks");
        System.out.println("=======================");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(+(C[i][j])+" ");
            }
            System.out.println(" ");
        }
    }
    
    
}
