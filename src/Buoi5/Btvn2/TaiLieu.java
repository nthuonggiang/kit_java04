/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5.Btvn2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TaiLieu {
    //mã tài liệu, tên tài liệu, tên nhà xuất bản;
    private String maTaiLieu;
    private String tenTaiLieu;
    private String tenNhaXuatBan;
    
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ma tai lieu: ");
        maTaiLieu=sc.nextLine();
        System.out.print("Nhap ten tai lieu: ");
        tenTaiLieu=sc.nextLine();
        System.out.print("Nhap ten nha xuat ban: ");
        tenNhaXuatBan=sc.nextLine();
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    
    
    @Override
    public String toString() {
        return "" + "maTaiLieu=" + maTaiLieu + ", tenTaiLieu=" + tenTaiLieu + ", tenNhaXuatBan=" + tenNhaXuatBan ;
    }
    
    
}
