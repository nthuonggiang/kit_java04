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
public class bt1 {
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
    public static void sapXepTangDan(int[] a,int n)
    {
        int tmp=a[0];
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    tmp=a[j];
                    a[j]=a[i];
                    a[i]=tmp;
                }
            }
        }
        inMang(a,n);
    }
    public static void sapXepGiamDan(int[] a,int n)
    {
        int tmp=a[0];
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
        inMang(a,n);
    }
    public static void main(String[] args) {
        int[]a= new int[100];
        int n=nhapN();
        nhapMang(a,n);
        inMang(a,n);
        System.out.print("Nhap lua chon: ");
        int chon=nhap.nextInt();
        
        switch(chon)
        {
            case 1:
                System.out.println("Mang sau khi sap xep tang dan la: ");
                sapXepTangDan(a,n);
                break;
            case 2:
                System.out.println("Mang sau khi sap xep giam dan la: ");
                sapXepGiamDan(a,n);
                break;
            default:
                System.out.println("Vui long nhap tu 1->2!");
        }
        
        
    }
}
