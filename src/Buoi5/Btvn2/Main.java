/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5.Btvn2;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
//        Sach s= new Sach();
//        TapChi tc=new TapChi();
//        
//        s.nhap();
//        tc.nhap();
//        
//        s.xuat();
//        tc.xuat();
        
        
        QuanLy quanly=new QuanLy();
        
        quanly.nhapSach();
        quanly.nhapTapChi();
        
        quanly.xuatCungNhaXuatBan();
        quanly.xuatCungNam();
    }
}
