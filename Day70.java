package pkg100daycodingisc;

import java.util.Scanner;

public class Day70 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.print("Masukkan Baris: ");
     int Baris = sc.nextInt();
     System.out.print("Masukkan Kolom: ");
     int Kolom = sc.nextInt();
        
      for (int i = 1; i <= Baris; i++) {
          for (int j = 1; j <= Kolom; j++) {
              System.out.print("*");
          }
             System.out.println();
        }
}
}
