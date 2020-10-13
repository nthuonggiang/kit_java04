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
public class Sach extends TaiLieu{
    //Số trang, năm xuất bản, lần tái bản, tên tác giả
    private int soTrang;
    private int namXuatBan;
    private int lanTaiBan;
    private String tenTacGia;
    
    
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap so trang: ");
        soTrang=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        namXuatBan=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap so lan tai ban: ");
        lanTaiBan=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ten tac gia: ");
        tenTacGia=sc.nextLine();
        
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }
    
    
    public void xuat()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Sach{ " +super.toString() + ", soTrang=" + soTrang + ", namXuatBan=" + namXuatBan + ", lanTaiBan=" + lanTaiBan + ", tenTacGia=" + tenTacGia + '}';
    }
    
    
}
