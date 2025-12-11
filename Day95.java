package pkg100daycodingisc;

import java.util.Scanner;

public class Day95 {
    public static void apamii(int sisi) {
        int luas = sisi * sisi;
        System.out.println(luas);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();
        apamii(angka);
    }
}
