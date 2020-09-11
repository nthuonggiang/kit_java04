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
public class bt8 {
    static int fibonacci(int n)
    {
        if(n==0 || n==1)
            return n;
        return (fibonacci(n-2) + fibonacci(n-1));
    }
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n=nhap.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println(fibonacci(i) + " " );
        }
    }

}
