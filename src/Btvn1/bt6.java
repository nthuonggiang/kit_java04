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
public class bt6 {
    static Scanner nhap=new Scanner(System.in);

    public static void nhapMang(int[] a,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print("Nhap a" + "[" + i + "]" + "=");
            a[i]=nhap.nextInt();
        }
    }
    public static void xuatMang(int[] a,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(" " + a[i]);
            
        }
    }
    public static int nhapN()
    {
        System.out.print("Nhap so luong phan tu: ");
        int n=nhap.nextInt();
        return n;
    }
    static void sapXepTangDan(int[] a,int n)
    {
        int tmp;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
    }
    static void sapXepGiamDan(int[] a,int n)
    {
        int tmp;
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
    }
    static void sapXepTangGiam(int[] a,int n)
    {
        int k=0,j=0;
        int[] duong=new int[100];
        int[] am=new int[100];
        for(int i=0;i<n;i++)  //tach mang
        {
            if(a[i]>=0)   
            {
                duong[j++]=a[i];
            }
            else
            {
                am[k++]=a[i];
            }
        }    
        sapXepTangDan(duong,j);
        xuatMang(duong,j);
        sapXepGiamDan(am,k);
        xuatMang(am,k);
    }
    
    public static void main(String[] args) {
        int[]a = new int[100];
        int n=nhapN(); 
        nhapMang(a,n);
        System.out.println("Mang vua nhap la: ");
        xuatMang(a,n);
        System.out.println(" ");
        System.out.println("Mang sau khi sap xep la: ");
        sapXepTangGiam(a,n);
        System.out.println(" ");
    }
    
//    tach(a,a1,)k=0,
//            
//            if(a<0) a[j++] = a[i] else a2[k++] - a[i]
//    sortTang(a1)
//    sortGIam(a2)
//    3 4 6 8 a1
//    -1 -2 -3 -5 a2
//    a[0]= a1[0] = 3
//    ....
//    a[3] = a1[3] = 8
//    a[4] = a2[0]
//    for(i) a[k] = a[i]
//    for(int i) a[k] = a2[i];1
//    
}
