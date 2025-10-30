package pkg100daycodingisc;

import java.util.Scanner;

public class Day533 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        for (int i = 1; i <= angka; i++) {
            System.out.println("Angka: " + i);

            if (i == 5) {
                break;
            }
        }
        System.out.println("Perulangan selesai");
    }
}
