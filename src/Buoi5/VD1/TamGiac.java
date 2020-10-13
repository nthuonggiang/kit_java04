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
public class TamGiac {
    private float a;
    private float b;
    private float c;
    
    public TamGiac()
    {
        
    }
    public void setA(float a)
    {
        this.a=a;
    }
    
    public void setB(float b)
    {
        this.b=b;
    }
    
    public void setC(float c)
    {
        this.c=c;
    }
    
    public float getA()
    {
        return a;
    }
    
    public float getB()
    {
        return b;
    }
    
    public float getC()
    {
        return c;
    }

    public float chuVi()
    {
        return a+b+c;
    }
    
    public float dienTich()
    {
        float p=chuVi()/2;
        return (float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    
    public void xuat()
    {
        System.out.println("Chu vi tam giac la: " + chuVi());
        System.out.println("Dien  tich tam giac la: "+ dienTich());
    }
}
