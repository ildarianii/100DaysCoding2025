package pkg100daycodingisc;

import java.util.Scanner;

public class Day59 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Nilai N: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        System.out.println();
        for (int i = 1; i < N; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }
    }
}
