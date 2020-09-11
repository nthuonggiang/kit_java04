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
public class bt5 {
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
    static void kiemTra(int[] a,int n,int k)
    {
        for(int i=0;i<n;i++)
        {
            if(a[i]==a[k])
                System.out.println("Tai vi tri " + k+ " phan tu co gia tri " + a[i]);
        }
    }
            
    public static void main(String[] args) {
        int[]a = new int[100];
        int n=nhapN(); 
        nhapMang(n,a);
        xuatMang(n,a);
        System.out.print("Nhap so k: ");
        int k=nhap.nextInt();
        kiemTra(a,n,k);
    }
}
