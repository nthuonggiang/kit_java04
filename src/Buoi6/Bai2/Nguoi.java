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
import java.util.Scanner;

public class Nguoi {
        protected String hoTen;
        protected int chieuCao;
        protected int Tuoi;
        protected String gioiTinh;
        protected String diaChi;
        protected int canNang;
        void nhap(){
            Scanner sc= new Scanner(System.in);
            System.out.println("nhập họ tên :");
            hoTen=sc.nextLine();
            System.out.println("nhập dịa chỉ :");
            diaChi=sc.nextLine();
            System.out.println("nhập giới tính :");
            gioiTinh=sc.nextLine();
            System.out.println("nhập cân nặng :");
            canNang=sc.nextInt();
            System.out.println("nhập chiều cao ");
            chieuCao=sc.nextInt();

        }
        void xuat(){
            System.out.println(toString());
        }

        @Override
        public String toString() {
            return "chung{" +
                    "hoTen='" + hoTen + '\'' +
                    ", chieuCao='" + chieuCao + '\'' +
                    ", Tuoi=" + Tuoi +
                    ", gioiTinh='" + gioiTinh + '\'' +
                    ", diaChi='" + diaChi + '\'' +
                    ", canNang=" + canNang +
                    '}';
        }

        public Nguoi(){

        }

        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public int getChieuCao() {
            return chieuCao;
        }

        public void setChieuCao(int chieuCao) {
            this.chieuCao = chieuCao;
        }

        public int getTuoi() {
            return Tuoi;
        }

        public void setTuoi(int tuoi) {
            Tuoi = tuoi;
        }

        public String getGioiTinh() {
            return gioiTinh;
        }

        public void setGioiTinh(String gioiTinh) {
            this.gioiTinh = gioiTinh;
        }

        public String getDiaChi() {
            return diaChi;
        }

        public void setDiaChi(String diaChi) {
            this.diaChi = diaChi;
        }

        public int getCanNang() {
            return canNang;
        }

        public void setCanNang(int canNang) {
            this.canNang = canNang;
        }

    public int tinhTien() {
        return 0;
    }
    

}