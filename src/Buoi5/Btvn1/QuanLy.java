/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5.Btvn1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QuanLy {
    ArrayList<SinhVien> listSV=new ArrayList<>();
    ArrayList<GiangVien> listGV=new ArrayList<>();
    
    Scanner sc=new Scanner(System.in);
    public void nhapSinhVien()
    {
        System.out.print("Nhap so luong sinh vien: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            SinhVien sv=new SinhVien();
            sv.nhap();
            listSV.add(sv);
        }
    }
    
    public void nhapGiangVien()
    {
        System.out.print("Nhap so luong giang vien: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            GiangVien gv=new GiangVien();
            gv.nhap();
            listGV.add(gv);
        }
    }
    
    public void xuatGioiTinhNu()
    {
        System.out.println("-----Danh sach sinh vien nu-----");
        for(int i=0;i<listSV.size();i++)
        {
            if(listSV.get(i).getGioiTinh().equalsIgnoreCase("nu"))
            {
                listSV.get(i).xuat();
            }
        }
        System.out.println("-----Danh sach giang vien nu-----");
        for(int i=0;i<listGV.size();i++)
        {
            if(listGV.get(i).getGioiTinh().equalsIgnoreCase("nu"))
            {
                listGV.get(i).xuat();
            }
        }
    }
}
