/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5.VD1;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        TamGiac tg=new TamGiac();
        tg.setA(3);
        tg.setB(4);
        tg.setC(5);
        System.out.println("( " + tg.getA() + ", " + tg.getB() + ", " + tg.getC()+" )");
        System.out.println("Chu vi tam giac la: " + tg.chuVi());
        System.out.println("Dien  tich tam giac la: "+ tg.dienTich());
    }
}
