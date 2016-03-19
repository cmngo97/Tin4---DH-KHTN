package Tuan2;

import java.util.Scanner;

public class Conversion {
    public static String decToChar(double x) {
        if (0 <= x && x < 4) 
            return "Diem he chu la F";
        else
            if (4 <= x && x < 6) 
            return "Diem he chu C";  
            else
                if (6 <= x && x < 8)
                return "Diem he chu B";
                else 
                    return "Diem he chu A";
    }
    
    public static void printStar() {
        for (int i = 0; i <= 20; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem: ");
        double x = sc.nextDouble();
        printStar();
     // System.out.println(decToChar(x));
        String kq = decToChar(x);
        System.out.println(kq);
        printStar();
    }
}
