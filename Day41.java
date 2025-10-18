package pkg100daycodingisc;

import java.util.Scanner;

public class Day41 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
            
double panjang = sc.nextDouble();
double lebar = sc.nextDouble();
        
double luas = panjang * lebar;
        
System.out.printf("Luas taman yang akan ditanami rumput adalah %.2f meter persegi", luas);
    }
    
}
