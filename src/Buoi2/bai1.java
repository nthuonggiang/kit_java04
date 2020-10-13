/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai1 {
    static Scanner nhap=new Scanner(System.in);
    
    static void nhapMang(int[][] a, int d,int c) {
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Nhap " + "a" + "[" + i + "]" + "[" + j + "]" + "=");
                a[i][j] = nhap.nextInt();
            }
        }
    }
    static void inMang(int[][] a,int d,int c)
    {
        System.out.println("Ma tran vua nhap la: ");
        for(int i=0;i<d;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.printf("%4d",a[i][j]);
            }
            System.out.println();
        }
    }
    static int tinhTongPhanTu(int [][] a,int d,int c)
    {
        int sum=0;
        for(int i=0;i<d;i++)
        {
            for(int j=0;j<c;j++)
            {
                sum+=a[i][j];
            } 
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] a=new int[100][100];
        System.out.print("Nhap so dong cua ma tran: ");
        int d=nhap.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int c=nhap.nextInt();
        nhapMang(a, d, c);
        inMang(a, d, c);
        System.out.println("Tong cac phan tu trong ma tran: "+tinhTongPhanTu(a, d, c));
    }
}
