/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5.Bai1;

import com.sun.org.apache.regexp.internal.REUtil;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String hoTen;
    private int namSinh;
    private String queQuan;
    private String gioiTinh;
    private String maLop;
    private String nganhHoc;
    private int khoa;
    
    public SinhVien()
    {
        
    }
    public SinhVien(String hoTen,int namSinh,String queQuan,String gioiTinh,String maLop,String nganhHoc,int khoa)
    {
        this.hoTen=hoTen;
        this.namSinh=namSinh;
        this.queQuan=queQuan;
        this.gioiTinh=gioiTinh;
        this.maLop=maLop;
        this.nganhHoc=nganhHoc;
        this.khoa=khoa;
    }
    
    public String getHoTen()
    {
        return hoTen;
    }
    public int getNamSinh()
    {
        return namSinh;
    }
    public String getQueQuan()
    {
        return queQuan;
    }
    
    public String getGioiTinh()
    {
        return gioiTinh;
    }
    public String getMaLop()
    {
        return maLop;
    }
    public String getNganhHoc()
    {
        return nganhHoc;
    }
    public int getKhoa()
    {
        return khoa;
    }
    
    public String getDetail()
    {
        return "Ho ten: " + this.hoTen + ", Nam sinh: " + this.namSinh
                + ", Que quan: "+this.queQuan+", Gioi tinh: "+this.gioiTinh
                +", Ma lop: "+this.maLop+", Khoa: "+this.khoa;
    }
}
