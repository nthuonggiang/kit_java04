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
public class bt4 {
    static Scanner nhap=new Scanner(System.in);
    
    public static void nhapMang(int[] a,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print("a" + "[" + i + "]" + "=");
            a[i]=nhap.nextInt();
        }
    }
    public static void xuatMang(int[] a,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("a" + "[" + i + "]" + "=" + a[i]);
        }
    }
    static int nhapN()
    {
        System.out.print("Nhap so luong phan tu: ");
        int n=nhap.nextInt();
        return n;
    }
    public static boolean kiemTra(int k,int[] a,int n)
    {
        for(int i=0;i<n;i++)
        {
            if(k==a[i])
                return true; 
        }
        return false;
    }
    public static int dem(int k,int[] a,int n)
    {
        int i=1;
        if(kiemTra(k,a,n))
            i++;
        return i;
    }
    public static void main(String[] args) {
        int[]a = new int[100];
        int n=nhapN();
        nhapMang(a,n);
        xuatMang(a,n);
        System.out.print("Nhap k: ");
        int k=nhap.nextInt();
        if(kiemTra(k,a,n))
        {
            System.out.printf("%d thuoc mang\n",k);
            System.out.printf("So la xuat hien %d la %d\n",k,dem(k,a,n));
        }
        else
            System.out.printf("%d khong thuoc mang\n",k);
    }
}
