/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4.Bai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PhanSo {
    int tuSo;
    int mauSo;
    
    void nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        tuSo=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap mau so: ");
        mauSo=sc.nextInt();
        sc.nextLine();
    }
    void xuat()
    {
        System.out.println("Phan so dang thap phan la: " + (float)tuSo/mauSo);
    }
    int UCLN(int tuSo,int mauSo)
    {
        int tmp=1;
        if(tuSo<0) 
            tuSo=-tuSo;
        if(mauSo<0)
            mauSo=-mauSo;
        int min=(tuSo<mauSo?tuSo:mauSo);
        for(int i=1; i<=min;i++)
        {
            if(tuSo%i==0 && mauSo%i==0)
                tmp=i;
        }
        return tmp;
    }
    void rutGon()
    {
        System.out.println((tuSo/UCLN(tuSo, mauSo)) + "/" + (mauSo/UCLN(tuSo, mauSo)));
    }
    void congPhanSo(PhanSo p)
    {
        PhanSo tong = new PhanSo();
        tong.tuSo=this.tuSo*p.mauSo+ this.mauSo*p.tuSo;
        tong.mauSo=this.mauSo*p.mauSo;
        tong.rutGon();
       
    }
    void truPhanSo(PhanSo p)
    {
        PhanSo hieu = new PhanSo();
        hieu.tuSo=this.tuSo*p.mauSo- this.mauSo*p.tuSo;
        hieu.mauSo=this.mauSo*p.mauSo;
        hieu.rutGon();
       
    }
    void nhanPhanSo(PhanSo p)
    {
        PhanSo tich = new PhanSo();
        tich.tuSo=this.tuSo*p.tuSo;
        tich.mauSo=this.mauSo*p.mauSo;
        tich.rutGon();
       
    }
    void chiaPhanSo(PhanSo p)
    {
        PhanSo thuong = new PhanSo();
        thuong.tuSo=this.tuSo*p.mauSo;
        thuong.mauSo=this.mauSo*p.tuSo;
        thuong.rutGon();
       
    }
}
