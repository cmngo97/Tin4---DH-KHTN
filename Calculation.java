package Tuan2;
import java.util.Scanner;
        
public class Calculation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = nextInt();
        int tong = 0;
        int dem = 0;
        
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            tong = tong + x;
            if ( x % 2 = 0)
                dem = dem++;
        }
        System.out.println("Tong co " + tong + dem + "so chan.");
    }
}
