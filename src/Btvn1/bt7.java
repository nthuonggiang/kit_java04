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
public class bt7 {
    static Scanner nhap=new Scanner(System.in);

    public static void nhapMang(int n,int[] a)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print("a" + "[" + i + "]" + "=");
            a[i]=nhap.nextInt();
        }
    }
    public static void xuatMang(int n,int[] a)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("a" + "[" + i + "]" + "=" + a[i]);
        }
    }
    public static int nhapN()
    {
        System.out.print("Nhap so luong phan tu: ");
        int n=nhap.nextInt();
        return n;
    }
    static void timMax(int[] a, int n) {
        int k = 0;
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                k = i;
            }
        }
        System.out.println("Phan tu lon nhat cua mang la "+ max + " nam o vi tri "+ k);
    }
    static void timMin(int[] a, int n) {
        int k = 0;
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
                k = i;
            }
        }
        System.out.println("Phan tu lon nhat cua mang la "+ min + " nam o vi tri "+ k);
    }
    public static void main(String[] args) {
        int[]a = new int[100];
        int n=nhapN(); 
        nhapMang(n,a);
        xuatMang(n,a);
        timMax(a,n);
        timMin(a,n);
    }
}
