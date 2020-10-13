/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6.Bai2;

/**
 *
 * @author Admin
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Quanly {
    // khai baos mang
    private ArrayList<Nguoi> danhSachNhanVien = new ArrayList<>();


    public void Menu(){
        System.out.println("\t \t \t Quản lý hệ thống ");
        System.out.println("1.Nhập thợ sửa ống nước");
        System.out.println("2.Xuất thowr sửa ống nước");
        System.out.println("3.nhập shipper");
        System.out.println("4.Xuất shipper");
        System.out.println("5.nhập NVXeOm");
        System.out.println("6.Xuất NVXeOm");
        System.out.println("7.tính tiền ");
        System.out.println("8.Xuat toan bo nhan vien");
        System.out.println("9.Thống kê lương giảm dần`");
        System.out.println("0.exit");
        System.out.println("Mời bạn chọn ");
    }
    public void xuatNV()
    {
        System.out.println("\t\t\tDANH SACH NHAN VIEN");
        for(Nguoi tmp : danhSachNhanVien)
        {
            tmp.xuat();
        }
    }
    public Quanly(){
    }
    public void nhapNVOngNuoc(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số thợ sửa ống nc: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("NHAP thợ thứ " + (i + 1));
            NVOngNuoc tmp = new NVOngNuoc();
            tmp.nhap();
            danhSachNhanVien.add(tmp);

        }
    }
    public void xuatNVOngNuoc(){
        System.out.println("\t\t\t danh sách thợ là : ");
        for (int i = 0; i < danhSachNhanVien.size(); i++) {
            if(danhSachNhanVien.get(i) instanceof NVOngNuoc) {
                System.out.print((i + 1) + ". ");
                danhSachNhanVien.get(i).xuat();
            }
        }
    }
    public void nhapShipper(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập số shipper :");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("nhập shipper thứ "+ (i+1));
            Shipper tmp =new Shipper();
            tmp.nhap();
            danhSachNhanVien.add(tmp);
        }
    }
    public void xuatShipper(){
        System.out.println("\t\t\t danh sách shipper là : ");
        for (int i = 0; i < danhSachNhanVien.size(); i++) {
            System.out.print((i+1)+ ". ");
            danhSachNhanVien.get(i).xuat();

        }
    }
    public void nhapNVXeOm(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập số NVXeOm :");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("nhập NVXeOm thứ "+ (i+1));
            NVXeOm tmp =new NVXeOm();
            tmp.nhap();
            danhSachNhanVien.add(tmp);
        }
    }
    public void xuatNVXeOm(){
        System.out.println("\t\t\t danh sách NVXeOm là : ");
        for (int i = 0; i < danhSachNhanVien.size(); i++) {
            System.out.print((i+1)+ ". ");
            danhSachNhanVien.get(i).xuat();

        }
    }
    public void tongTien(){
        int tongTien=0;
        for(int i=0;i<danhSachNhanVien.size();i++)
        {
            tongTien= danhSachNhanVien.get(i).tinhTien();
        }
        System.out.println("Tong tien cua tat ca nhan vien la: " + tongTien);

    }
/*

    public void thongKeLuongGiamDan() {
        System.out.println("\t\tNhanVienOngNUOc");
        // sắp xếp mảng giảm dần theo lương
        SapXepLuongNVOngNuocGiamDan();
        for(NVOngNuoc tmp : danhSachNhanVien) // xuat danh sach nv ong nuoc
        {
            tmp.xuat();
        }

        System.out.println("\t\tNhanVienXeOm");
        // sắp xếp mảng giảm dần theo lương
        SapXepLuongNVXeOmGiamDan();
        for(NVXeOm tmp : danhSachNhanVien) // xuat danh sach nv ong nuoc
        {
            tmp.xuat();
        }
        System.out.println("\t\tNhanVienShipper");
        // sắp xếp mảng giảm dần theo lương
        SapXepLuongShipperGiamDan();
        for(Shipper tmp : danhSachNhanVien) // xuat danh sach nv ong nuoc
        {
            tmp.xuat();
        }
    }

    private void SapXepLuongNVOngNuocGiamDan() {
        for (int i = 0; i < danhSachNhanVien.size()-1; i++) {
            for (int j=i+1; j<danhSachNhanVien.size(); j++)
            {
                if(danhSachNhanVien.get(i).tinhTien()<danhSachNhanVien.get(j).tinhTien())
                {
                    NVOngNuoc tmp;
                    tmp = danhSachNhanVien.get(i);//tmp = a;
                    danhSachNhanVien.set(i,danhSachNhanVien.get(j)); //a=b;
                    danhSachNhanVien.set(j,tmp); //b=tmp;
                }
            }

        }
    }
    private void SapXepLuongNVXeOmGiamDan() {
        for (int i = 0; i < danhSachNhanVien.size()-1; i++) {
            for (int j=i+1; j<danhSachNhanVien.size(); j++)
            {
                if(danhSachNhanVien.get(i).tinhTien()<danhSachNhanVien.get(j).tinhTien())
                {
                    NVXeOm tmp;
                    tmp = danhSachNhanVien.get(i);//tmp = a;
                    danhSachNhanVien.set(i,danhSachNhanVien.get(j)); //a=b;
                    danhSachNhanVien.set(j,tmp); //b=tmp;
                }
            }

        }
    }
    private void SapXepLuongShipperGiamDan() {
        for (int i = 0; i < danhSachNhanVien.size()-1; i++) {
            for (int j=i+1; j<danhSachNhanVien.size(); j++)
            {
                if(danhSachNhanVien.get(i).tinhTien()<danhSachNhanVien.get(j).tinhTien())
                {
                    Shipper tmp;
                    tmp = danhSachNhanVien.get(i);//tmp = a;
                    danhSachNhanVien.set(i,danhSachNhanVien.get(j)); //a=b;
                    danhSachNhanVien.set(j,tmp); //b=tmp;
                }
            }

        }
    }
    *
 */
}
