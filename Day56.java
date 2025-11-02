package pkg100daycodingisc;

import java.util.Scanner;

public class Day56 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();

        do {
            System.out.println(angka);
            angka++;

        } while (angka <= 10);
        System.out.println("Perulangan selesai");
    }
}
