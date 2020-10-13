/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4.Bai3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SinhVien {
    String maSinhVien;
    String tenSinhVien;
    String queQuan;
    float diemThiA1;
    float diemThiA3;
    float diemThiNguyenLi1;
    
    void nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        maSinhVien=sc.nextLine();
        System.out.print("Nhap ten sinh vien: ");
        tenSinhVien=sc.nextLine();
        System.out.print("Nhap que quan: ");
        queQuan=sc.nextLine();
        System.out.print("Nhap diem mon toan cao cap A1: ");
        diemThiA1=sc.nextFloat();
        sc.nextLine();
        System.out.print("Nhap diem mon toan cao cap A3: ");
        diemThiA3=sc.nextFloat();
        sc.nextLine();
        System.out.print("Nhap diem mon nguyen li 1: ");
        diemThiNguyenLi1=sc.nextFloat();
        sc.nextLine();
    }
    void xuat()
    {
        System.out.println("Mã sinh viên: " + maSinhVien);
        System.out.println("Tên sinh viên: " + tenSinhVien);
        System.out.println("Quê quán: " + queQuan);
        System.out.println("Điểm thi A1: " + diemThiA1);
        System.out.println("Điểm thi A3: " + diemThiA3);
        System.out.println("Điểm thi nguyen li 1: " + diemThiNguyenLi1);
    }
    float diemTrungBinh()
    {
        return (float)(diemThiA1+diemThiA3+diemThiNguyenLi1)/3;
    }
    int soMonTach()
    {
        int dem=0;
        if(diemThiA1<4)
        {
            dem++;
            
            if(diemThiA3<4)
            {
                dem++;
                if(diemThiNguyenLi1<4)
                {
                    dem++;
                }
            }
        }
        return dem;
    }
    int soTienNopThiLai()
    {
        return 90000*soMonTach();
    }
    
}
