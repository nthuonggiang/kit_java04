/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5.Btvn1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SinhVien extends ConNguoi{
    private String maLop;
    private String nganhHoc;
    private int khoa;
    
    
    
    public void hocVoiGiangVien(GiangVien gv)
    {
        if(this.nganhHoc.equalsIgnoreCase(gv.getkhoa()))
        {
            System.out.println("Có cơ hội học"); 
        }
        else
        {
            System.out.println("Không có cơ hội học");
        }
    }
    
    
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhap ma lop: ");
        maLop=sc.nextLine();
        System.out.print("Nhap nganh hoc: ");
        nganhHoc=sc.nextLine();
        System.out.print("Nhap khoa: ");
        khoa=sc.nextInt();
        sc.nextLine();
    }
    
    public void xuat()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "SinhVien{ " + super.toString() + ", maLop=" + maLop + ", nganhHoc=" + nganhHoc + ", khoa=" + khoa + '}';
    }
    
    public SinhVien()
    {
        
    }
}
