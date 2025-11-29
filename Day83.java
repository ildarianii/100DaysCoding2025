package pkg100daycodingisc;

import java.util.Scanner;

public class Day83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai [] = new int [5];
        int jumlah = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("Masukkan angka ke-%d: ", i+1);
            nilai[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            jumlah += nilai[i];
        }
        System.out.printf("Jumlah keseluruhan = %d", jumlah);
    }
    
}
