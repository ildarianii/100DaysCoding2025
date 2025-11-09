package pkg100daycodingisc;

import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka N: ");
        int N = sc.nextInt();
        int hasil = 1;
        
        for (int i = 1; i <= N; i++) {
            hasil *= i;
        }
        System.out.printf("Hasil dari perkalian 1-N = %d", hasil);
        System.out.println();
    }
    
}
