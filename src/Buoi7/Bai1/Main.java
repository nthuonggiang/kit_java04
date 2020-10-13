/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi7.Bai1;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        HinhHoc htron = new HinhTron();
        htron.nhap();
        
        HinhHoc hcn = new HinhChuNhat();
        hcn.nhap();
        
        htron.tinhDienTich();
        hcn.tinhDienTich();
                
    }
}
