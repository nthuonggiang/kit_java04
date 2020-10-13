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
public class GiangVien extends ConNguoi{
    private String khoa;
    private String monHoc;
    private int namKinhNghiem;
    
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhap khoa: ");
        khoa=sc.nextLine();
        System.out.print("Nhap mon hoc: ");
        monHoc=sc.nextLine();
        System.out.print("Nhap nam kinh nghiem: ");
        namKinhNghiem=sc.nextInt();
        sc.nextLine();
    }
    
    public void xuat()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "GiangVien{ " +super.toString() + ", khoa=" + khoa + ", monHoc=" + monHoc + ", namKinhNghiem=" + namKinhNghiem + '}';
    }
    
    public GiangVien(){
        
    }

    String getkhoa() {
        return khoa;
    }
}
