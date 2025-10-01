package pkg100daycodingisc;

import java.util.Scanner;

public class Day24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        int jr = sc.nextInt();
        double pi = 3.14;
        
        double luas = pi * jr * jr;
        
        System.out.println("Luas lingkaran = " + luas);
        
    }

}
