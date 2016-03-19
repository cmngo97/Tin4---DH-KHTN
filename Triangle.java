package Tuan2;

import java.util.Scanner;

public class Triangle {
   
    public static boolean isTriangle(int a, int b, int c) {
        if ( (a+b)>c && (b+c)>a && (a+c)>a ) {
            return true;
        } else return false;
    }
    
    public static double triangleSquare(int a, int b, int c) {
        double p = (a+b+c)/2;
        double S = (p*(p-a)*(p-b)*(p-c))/2;
        return S;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 3 canh cua tam giac: ");
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        boolean kq = isTriangle(a, b, c);
        if (kq == false) {
            System.out.println("Day ko phai tam giac");
        } else {
            System.out.println("3 canh " + a + " " + b + " " + c + " lap thanh tam giac");
            System.out.println("Dien tich la: " + triangleSquare(a, b, c) + "(dvdt)");
        }
        
    }
}
