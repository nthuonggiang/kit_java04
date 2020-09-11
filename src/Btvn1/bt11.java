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
public class bt11 {
    static Scanner nhap=new Scanner (System.in);
    
    static void nhapMang(int[][] a,int d,int c,char ten)
    {
        Random rand= new Random();
        //System.out.println("Nhap ma tran " + ten);
        for(int i=0;i<d;i++)
        {
            for(int j=0;j<c;j++)
            {
               // System.out.print("Nhap "+"a"+"["+i+"]"+"["+j+"]"+ "=");
                a[i][j]=rand.nextInt(10);
            }
        }
    }
    static void inMang(int[][]a,int d,int c,char ten)
    {
        System.out.println("Ma tran " + ten);
        for(int i=0;i<d;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.printf("%4d",a[i][j]);
            }
            System.out.printf("\n");
        }
    }
    static void tinhTichMaTran(int[][] a,int[][] b,int[][] c,int d1,int c1,int c2)
    {
        for (int i = 0; i < d1; i++) {
                for (int j = 0; j < c2; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < c1; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
        inMang(c,d1,c2,'C');
    }
    public static void main(String[] args) {
        int d1,c1,d2,c2;
        int[][]a = new int[100][100];
        int[][]b= new int[100][100];
        int[][]c= new int[100][100];
        System.out.print("Nhap so dong ma tran A: ");
        d1=nhap.nextInt();
        System.out.print("Nhap so cot ma tran A: ");
        c1=nhap.nextInt();
        nhapMang(a,d1,c1,'A');
        System.out.print("Nhap so dong ma tran B: ");
        d2=nhap.nextInt();
        System.out.print("Nhap so cot ma tran B: ");
        c2=nhap.nextInt();
        nhapMang(b,d2,c2,'B');
        inMang(a,d1,c1,'A');
        inMang(b,d2,c2,'B');
        if(c1!=d2)
            System.out.println("Hai ma tran khong nhan duoc!");
        else
        {
            System.out.println("Ma tran tich la: ");
            tinhTichMaTran(a,b,c,d1,c1,c2);
        }
    }
}
