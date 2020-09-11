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
public class bt3 {
    static Scanner nhap=new Scanner(System.in);
    
    static void nhapMang(int[] a,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print("Nhap " + "a" +"[" + i+ "]" +"=");
            a[i]=nhap.nextInt();
        }
    }
    static void inMang(int[] a,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("a" +"[" + i+ "]" +"=" + a[i]);
        }
    }
    static int nhapN()
    {
        System.out.print("Nhap so luong phan tu: ");
        int n=nhap.nextInt();
        return n;
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
    public static void lietKeSNT(int[] a,int n)
    {
        for(int i=0;i<n;i++)
        {
            if(laSNT(a[i]))
                System.out.println(" " + a[i]);
        }
    }
    public static void main(String[] args) {
        int[]a=new int[100];
        int n=nhapN();
        nhapMang(a,n);
        inMang(a,n);
        System.out.println("So nguyen to trong mang la: ");
        lietKeSNT(a,n);
    }
}
