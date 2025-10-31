package pkg100daycodingisc;

import java.util.Scanner;

public class Day54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        
        for (int i = 1; i <= angka; i++) {
            if (i == 5) {
            continue;   
}
        System.out.println("Angka ke-" + i);
}
        System.out.println("Selesai.");
}
}
