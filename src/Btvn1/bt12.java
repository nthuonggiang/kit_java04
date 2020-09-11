/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Btvn1;

import static Btvn1.bt11.nhap;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bt12 {

    static Scanner nhap = new Scanner(System.in);

    static void nhapMang(int[][] a, int m,int n, char ten) {
        System.out.println("Nhap ma tran " + ten);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhap " + "a" + "[" + i + "]" + "[" + j + "]" + "=");
                a[i][j] = nhap.nextInt();
            }
        }
    }

    static void inMang(int[][] a, int m,int n, char ten) {
        System.out.println("Ma tran " + ten);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.printf("\n");
        }
    }

    static boolean kiemTraMaTranNghichDao(int[][] a, int m1, int n1, int[][] b, int m2, int n2) {
        //kiem tra kich co
        if (n1 != m1 || n2 != m2) // neu ko phai ma tran vuong
        {
            return false;
        } else {
            if (n1 != n2) // neu 2 ma tran vuong size khac nhau
            {
                return false;
            }
        }
        int[][] c=new int[m1][m1];
        tinhTichMaTran(a,b,c,m1,n1,n2);
        int[][] d=new int[m1][m1];
        tinhTichMaTran(b,a,d,m1,n1,n2);
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < m1; j++) {

                if (c[i][j] != d[i][j]) // neu 2 ptu khac nhau => ko phai ma tran nghich dao
                {
                    return false;

                }
                //chi con truong hop = nhau
                if (i == j && c[i][j] != 1) //kiem tra duong cheo chinh == 1
                {
                    return false;
                }
                if (i != j && c[i][j] != 0) //kiem tra ptu khac 0
                {
                    return false;
                }
            }
        }
        return true;

    }
static void tinhTichMaTran(int[][] a,int[][] b,int[][] c,int m1,int n1,int n2)
    {
        for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < n1; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
    }
    public static void main(String[] args) {
        int m1,n1,m2,n2;
        int[][] a = new int[100][100];
        int[][] b = new int[100][100];
        
        System.out.print("Nhap so dong ma tran A: ");
        m1=nhap.nextInt();
        System.out.print("Nhap so cot ma tran A: ");
        n1=nhap.nextInt();
        nhapMang(a,m1,n1,'A');
        System.out.print("Nhap so dong ma tran B: ");
        m2=nhap.nextInt();
        System.out.print("Nhap so cot ma tran B: ");
        n2=nhap.nextInt();

        nhapMang(b,m2,n2, 'B');
        inMang(a,m1,n1, 'A');
        inMang(b,m2,n2, 'B');
       
        System.out.println(kiemTraMaTranNghichDao(a,m1,n2,b,m2,n2));
    }
}
