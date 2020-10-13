/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5.Bai1;

/**
 *
 * @author Admin
 */
public class GiaoVien {
    private String hoTen;
    private int namSinh;
    private String queQuan;
    private String gioiTinh;
    private String khoa;
    private String monHoc;
    private int namKinhNghiem;
    
    public GiaoVien()
    {
        
    }
    public GiaoVien(String hoTen,int namSinh,String queQuan,String gioiTinh,String khoa,String monHoc,int namKinhNghiem)
    {
        this.hoTen=hoTen;
        this.namSinh=namSinh;
        this.queQuan=queQuan;
        this.gioiTinh=gioiTinh;
        this.khoa=khoa;
        this.monHoc=monHoc;
        this.namKinhNghiem=namKinhNghiem;
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

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public int getNamKinhNghiem() {
        return namKinhNghiem;
    }

    public void setNamKinhNghiem(int namKinhNghiem) {
        this.namKinhNghiem = namKinhNghiem;
    }
    
}
