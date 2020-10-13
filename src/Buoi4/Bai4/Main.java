/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4.Bai4;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        SanPham sp=new SanPham();
        
        sp.nhap();
        sp.xuat();
        
        System.out.println("Số tiền lãi khi bán hết các sản phẩm là: " + sp.tinhLaiNeuBanHet());
        System.out.println("Số tiền lãi khi bán 2/3 số lượng sản phẩm: " + sp.tinhLaiNeuKhongBanHet());
    }
}
