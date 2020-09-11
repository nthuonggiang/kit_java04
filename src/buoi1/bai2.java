/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1;

import java.util.Scanner;


public class bai2 {
    public static int UCLN(int a,int b)
    {
        int tmp=1;
        for(int i=1;i<=a && i<=b;i++)
        {
           if(b%i==0 && a%i==0)
                tmp=i;
        }
        return tmp;
    }
    public static int BCNN(int a,int b)
    {
        return (a*b)/UCLN(a,b);
    }
    public static int tinhTong(int a,int b)
    {
        return UCLN(a,b)+BCNN(a,b);
    }
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a=nhap.nextInt();
        System.out.print("Nhap b: ");
        int b=nhap.nextInt();
        System.out.printf("UCLN(%d,%d)=%d\n",a,b,UCLN(a,b));
        System.out.printf("BCNN(%d,%d)=%d\n",a,b,BCNN(a,b));
        System.out.println("Tong la: " + tinhTong(a,b));
    }
    
}
