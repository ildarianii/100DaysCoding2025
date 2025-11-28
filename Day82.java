package pkg100daycodingisc;

import java.util.Scanner;

public class Day82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak mahasiswa: ");
        int bnya = sc.nextInt();
        sc.nextLine();
        String nama [] = new String [bnya];
        
        for (int i = 0; i < bnya; i++) {
            System.out.printf("Masukkan nama mahasiswa ke-%d: ", i + 1);
            nama[i] = sc.nextLine();
        }
        System.out.println("==== DAFTAR LENGKAP NAMA MAHASISWA ====");
        for (int i = 0; i < bnya; i++) {
            System.out.println(nama[i].toUpperCase());
        }
            
    }
    }
    

