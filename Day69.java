package pkg100daycodingisc;

import java.util.Scanner;

public class Day69 {
    public static void main(String[] args) {
        //cetak dulu kelipatan 7 terus selanjutnya cek dan cetak angka ganjil dan genap pada kelipatan 7
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka N: ");
        int N = sc.nextInt();
        
        System.out.print("Angka Kelipatan 7: ");
        
        for (int i = 1; i <= N; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.print("\nAngka Ganjil pada Kelipatan 7: ");

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 1 && i % 7 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.print("\nAngka Genap pada Kelipatan 7: ");

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0 && i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println();

    }

}
