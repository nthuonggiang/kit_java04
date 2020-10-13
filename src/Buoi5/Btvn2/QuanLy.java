/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5.Btvn2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QuanLy {
    ArrayList<Sach> listS= new ArrayList<>();
    ArrayList<TapChi> listTC=new ArrayList<>();
    
    Scanner sc= new Scanner(System.in);
    public void nhapSach()
    {
        System.out.print("So luong sach muon nhap: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            Sach s=new Sach();
            s.nhap();
            listS.add(s);
        }
    }
    
    public void nhapTapChi()
    {
        System.out.print("Nhap so luong tap chi: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            TapChi tc=new TapChi();
            tc.nhap();
            listTC.add(tc);
        }
    }
    
    public void xuatCungNhaXuatBan()
    {
        boolean timThay=false;
        for(int i=0;i<listS.size();i++)
        {
            for(int j=0;j<listTC.size();j++)
            {
                if(listS.get(i).getTenNhaXuatBan().equalsIgnoreCase(listTC.get(j).getTenNhaXuatBan()))
                {
                    timThay=true;
                    System.out.println(listS.get(i).getTenNhaXuatBan());
                } 
                
            }
        }
        if(timThay==false) 
        {
            System.out.println("Khong co sach nao cung ten nha xuat ban voi tap chi!");
        }
    }
    
    public void xuatCungNam()
    {
        boolean timThay=false;
        
        for(int i=0;i<listS.size();i++)
        {
            for(int j=0;j<listTC.size();j++)
            {
                System.out.println(listTC.get(j).nam());
                if(listS.get(i).getNamXuatBan()==listTC.get(j).nam())
                {
                    timThay=true;
                    System.out.println(listS.get(i).getNamXuatBan());
                }
            }
        }
        if(timThay==false)
        {
            System.out.println("Khong tim thay sach va tap chi xuat ban cung nam");
        }
    }
            
}
