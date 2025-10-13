package pkg100daycodingisc;

import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai anda: ");
        int nilai = sc.nextInt();
        
        if (nilai >= 75) {
            if (nilai >= 90) {
                System.out.println("Lulus dengan predikat A");
                
            }else{
                System.out.println("Lulus dengan predikat B");
            }
            
        }else{
            System.out.println("Tidak Lulus");
        }
    }
}
