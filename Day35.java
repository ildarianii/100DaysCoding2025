package pkg100daycodingisc;

import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        
        if (angka % 2 == 1) {
            System.out.println("Angka Ganjil");
            
        }else{
            System.out.println("Angka Genap");
        }
    }
    
}
