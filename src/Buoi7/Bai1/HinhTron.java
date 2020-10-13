/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi7.Bai1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HinhTron extends HinhHoc{
    private float banKinh;
    
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        banKinh=sc.nextFloat();
    }
    
    public void tinhDienTich()
    {
        System.out.println("Dien tich hinh tron la: " + Math.PI*banKinh*banKinh);
    }
}
