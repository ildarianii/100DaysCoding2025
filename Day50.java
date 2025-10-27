package pkg100daycodingisc;

import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        
        String hasil = (angka % 2 == 0) ? "Angka Genap" : "Angka Ganjil";
        
        System.out.println("Angka: " + angka);
        System.out.println(hasil);
    }
}
