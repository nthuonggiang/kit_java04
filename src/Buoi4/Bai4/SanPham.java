/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4.Bai4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SanPham {
    String maSanPham;
    String tenSanPham;
    int giaMuaVao;
    int giaBanRa;
    int soLuong;
    
    void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ma san pham: ");
        maSanPham=sc.nextLine();
        System.out.print("Nhap ten san pham: ");
        tenSanPham=sc.nextLine();
        System.out.print("Nhap gia mua vao: ");
        giaMuaVao=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap gia ban ra: ");
        giaBanRa=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap so luong: ");
        soLuong=sc.nextInt();
        sc.nextLine();
    }
    void xuat()
    {
        System.out.println("Mã sản phẩm: " + maSanPham);
        System.out.println("Tên sản phẩm: " + tenSanPham);
        System.out.println("Giá mua vào: " + giaMuaVao);
        System.out.println("Giá bán ra: " + giaBanRa);
        System.out.println("Số lượng: " + soLuong);
    }
    int tinhLaiNeuBanHet()
    {
        return soLuong*(giaBanRa-giaMuaVao);
    }
    float tinhLaiNeuKhongBanHet()
    {
       return (float)(2*soLuong*(giaBanRa-giaMuaVao))/3;
    }
}
