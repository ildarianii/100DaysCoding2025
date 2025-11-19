package pkg100daycodingisc;

import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hasil = 0;
       
        while (true){
           System.out.print("Masukkan angka: ");
           int angka = sc.nextInt();
        
            if (angka < 0) {
                break; 
            }
             hasil += angka;
        }
        System.out.println("Hasil = " + hasil);
    }
}
