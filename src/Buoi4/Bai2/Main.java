/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4.Bai2;

/**
 *
 * @author Admin
 */
public class Main {
    
    public static void main(String[] args) {
        PhanSo p1=new PhanSo();
        p1.nhap();
        PhanSo p2=new PhanSo();
        p2.nhap();
        //p1.xuat(); //1,in
        p1.rutGon();   //2,rút gọn
        p2.rutGon();
        
        p1.xuat(); //4,in  ra dạng thập phân
        
        System.out.println("Ket qua cong 2 phan so la: ");  //3,cộng ,trừ,nhân,chia
        p1.congPhanSo(p2);
        
        System.out.println("Ket qua tru 2 phan so la: ");
        p1.truPhanSo(p2);
        
        System.out.println("Ket qua nhan 2 phan so la: ");
        p1.nhanPhanSo(p2);
        
        System.out.println("Ket qua thuong 2 phan so la: ");
        p1.chiaPhanSo(p2);
            
    }
    
}
