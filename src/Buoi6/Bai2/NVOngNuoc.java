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

public class NVOngNuoc extends Nguoi{
        private int soGiosua;
        public int tinhTien(){
            return soGiosua*50000;
        }
        void nhap(){
            super.nhap();
            Scanner sc=new Scanner(System.in);
            System.out.println("nhập số giờ sửa :");
            soGiosua=sc.nextInt();
        }
        void xuat(){
            System.out.println(toString());
        }

        @Override
        public String toString() {
            return "ongNuoc{" +
                    super.toString() +
                    "soGiosua=" + soGiosua +
                    '}';
        }
        public NVOngNuoc(){

        }

        public int getSoGiosua() {
            return soGiosua;
        }

        public void setSoGiosua(int soGiosua) {
            this.soGiosua = soGiosua;
        }


}