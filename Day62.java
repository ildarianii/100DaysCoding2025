package pkg100daycodingisc;

import java.util.Scanner;

public class Daay62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();
        int hasil = 0;
        
        for (int i = 1; i <= N; i++) {
            hasil += i;
        }
        System.out.printf("Hasil dari penjumlahan dari 1-N = %d", hasil);
        System.out.println();
    }
    
}
