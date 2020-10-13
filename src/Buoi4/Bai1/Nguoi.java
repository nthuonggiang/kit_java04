/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4.Bai1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Nguoi {
    String ten;
    int namSinh;
    String quocTich;
    
    void say()
    {
        System.out.println("Hello");
//        System.out.println("Ten: " + ten);
//        System.out.println("Nam sinh: " + namSinh);
//        System.out.println("Quoc tich: " + quocTich);
    }
    
    void nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ten: ");
        ten=sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        namSinh=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap quoc tich: ");
        quocTich=sc.nextLine();
    }
    void display()
    {
        System.out.println("Tên: " + ten);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Quốc tịch: " + quocTich);
    }
}
