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
public class ConNguoi {
    private String hoTen;
    private int namSinh;
    private String queQuan;
    private String gioiTinh;

    public void nhapThongTin()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ten: ");
        hoTen=sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        namSinh=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap que quan: ");
        queQuan=sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gioiTinh=sc.nextLine();
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    
    @Override
    public String toString() {
        return "" + "hoTen=" + hoTen + ", namSinh=" + namSinh + ", queQuan=" + queQuan + ", gioiTinh=" + gioiTinh ;
    }

}
