/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class mangbai1 {
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
    public static int tinhTong(int n,int[] a)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        return sum;
    }
    public static int nhapN()
    {
        System.out.print("Nhap so luong phan tu: ");
        int n=nhap.nextInt();
        return n;
    }
    public static void main(String[] args) {
        int[]a = new int[100];
        int n=nhapN();
        
        nhapMang(n,a);
        xuatMang(n,a);
        System.out.println("Tong cua cac phan tu trong mang la: " + tinhTong(n,a));
    }
}
