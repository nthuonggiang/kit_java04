/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4.Bai3;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        sv1.nhap();
        sv1.xuat();
        System.out.printf("Điểm trung bình là: %.2f\n" , sv1.diemTrungBinh());
        System.out.println("Sinh viên phải nộp " + sv1.soTienNopThiLai() + " thi lai");
    }
}
