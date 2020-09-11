/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Btvn1;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bt10 {
    static Scanner nhap=new Scanner(System.in);
    
    static void nhapMang(int[][] a,int d,int c)
    {
        Random rand=new Random();
        for(int i=0;i<d;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=rand.nextInt(50);
            }
        }
    }
    static void inMang(int[][] a,int d,int c)
    {
        for(int i=0;i<d;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.printf("%4d",a[i][j]);
            }
            System.out.printf("\n");
        }
    }
    static void sapXep(int[][] a,int d,int c)
    {
        int tmp;
        int n=d*c;
        int[]b=new int[n];
        for(int i=0;i<n;i++)
        {
            b[i]=a[i/c][i%c];
        }
        for(int i=0;i<(n-1);i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(b[i]>b[j])
                {
                    tmp=b[i];
                    b[i]=b[j];
                    b[j]=tmp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            a[i/c][i%c]=b[i];
        }
        inMang(a,d,c);
    }
    public static void main(String[] args) {
        int[][]a= new int[100][100];
        System.out.print("Nhap so dong: ");
        int d=nhap.nextInt();
        System.out.print("Nhap so cot: ");
        int c=nhap.nextInt();
        nhapMang(a,d,c);
        System.out.println("Ma tran vua nhap la: ");
        inMang(a,d,c);
        System.out.println("Ma tran sau khi sap xep: ");
        sapXep(a,d,c);
    }

    
}
