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
public class HinhChuNhat extends HinhHoc{
    private float chieuDai;
    private float chieuRong;
    
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        chieuDai=sc.nextFloat();
        System.out.print("Nhap chieu rong: ");
        chieuRong=sc.nextFloat();
    }
    
    public void tinhDienTich()
    {
        System.out.println("Dien tich hinh chu nhat la: " + chieuDai*chieuRong);
    }
}
