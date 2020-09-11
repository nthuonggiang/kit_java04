/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Btvn1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bt9 {
    static Scanner nhap=new Scanner (System.in);
    
    static void nhapMang(int[][] a,int d,int c)
    {
        for(int i=0;i<d;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print("Nhap "+"a"+"["+i+"]"+"["+j+"]"+ "=");
                a[i][j]=nhap.nextInt();
            }
        }
    }
    static void inMang(int[][]a,int d,int c)
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
    static boolean laSNT(int n)
    {
        if(n<2)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    static void timSNT(int[][] a,int d,int c)
    {
        for(int i=0;i<d;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(laSNT(a[i][j]))
                    System.out.printf(" %d\t",a[i][j]);
            }
        }
        System.out.printf("\n");
    }
    public static void main(String[] args) {
        int[][]a= new int[100][100];
        System.out.print("Nhap so dong: ");
        int d=nhap.nextInt();
        System.out.print("Nhap so cot: ");
        int c=nhap.nextInt();
        nhapMang(a,d,c);
        inMang(a,d,c);
        System.out.println("So nguyen to co trong mang la: ");
        timSNT(a,d,c);
    }
}
