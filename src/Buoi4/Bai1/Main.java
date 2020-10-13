/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4.Bai1;



/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Nguoi n1=new Nguoi();
        n1.nhap();
        Nguoi n2=new Nguoi();
        n2.nhap();
        
        n1.display();
        n2.display();
        
        Nguoi max=(n1.namSinh<n2.namSinh?n1:n2);
        System.out.println("Người lớn tuổi hơn là: " + max.ten);
    }
}
