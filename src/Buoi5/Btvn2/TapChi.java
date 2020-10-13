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
public class TapChi extends TaiLieu{
    // Ngày xuất bản, số trang, danh mục xuất bản.
    private String ngayXuatBan;
    private int soTrang;
    private String danhMucXuatBan;
    
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap ngay xuat ban: ");
        ngayXuatBan=sc.nextLine();
        System.out.print("Nhap so trang: ");
        soTrang=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap danh muc xuat ban: ");
        danhMucXuatBan=sc.nextLine();
    }
    
    public void xuat()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "TapChi{ " + super.toString() + ", ngayXuatBan=" + ngayXuatBan + ", soTrang=" + soTrang + ", danhMucXuatBan=" + danhMucXuatBan + '}';
    }
    
    public int nam()
    {
        String ngay=ngayXuatBan;
        char[] ngay2=ngay.toCharArray();
        String nam=String.copyValueOf(ngay2,ngay.length()-4,4);
        return Integer.valueOf(nam);
    }
}
