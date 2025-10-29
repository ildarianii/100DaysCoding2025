package pkg100daycodingisc;

import java.util.Scanner;

public class Day52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        
        while (angka <= 100){
            System.out.println(angka);
            angka++;
        }
        
    }
    
}
