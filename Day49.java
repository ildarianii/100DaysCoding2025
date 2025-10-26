package pkg100daycodingisc;

import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama anda: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan nilai anda: ");
        int nilai = sc.nextInt();
        
        String nilaiakhir = (nilai >= 75) ? "SELAMAT ANDA LULUS" : "ANDA TIDAK LULUS, COBA LAGI TAHUN DEPAN";
        System.out.println("Nama: " + nama);
        System.out.println(nilaiakhir);
    }
}
