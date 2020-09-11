
package buoi1;

import java.util.Scanner;


public class bai1 {

   
    public static void tinhTong(int a,int b)
    {
        System.out.println(a + "+" + b + "=" + (a+b));
    }
    public static int hieu(int a,int b)
    {
        return (a-b);
    }
    public  static int tinhGiaiThua(int n)
    {
        int gt=1;
        for(int i=1;i<=n;i++)
        {
            gt=gt*i;
        }
        return gt;
    }
    public static int luyThua(int a,int b)
    {
        int tmp=1;
        for(int i=0; i<b; i++)
        {
            tmp= tmp*a;
        }
        return tmp;
    }
    public static void bangCuuChuong(int n)
    {
        int tmp=n;
        for(int i=1;i<=10;i++)
        {
            System.out.println(n + "*" + i + "=" + tmp*i);
        }
        
    }
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a=nhap.nextInt();
        System.out.print("Nhap b: ");
        int b=nhap.nextInt();
        /*tinhTong(a,b);
        System.out.println(a + "-" + b + "=" + hieu(a,b));
        System.out.println(a + "!" + "=" + tinhGiaiThua(a));
        System.out.println(b + "!" + "=" + tinhGiaiThua(b));
        System.out.println(a + "^" + b + "=" + luyThua(a,b));*/
        System.out.printf("Bang cuu chuong cua %d:\n",a);
        bangCuuChuong(a);
        System.out.printf("Bang cuu chuong cua %d:\n",b);
        bangCuuChuong(b);
    }
    
}
