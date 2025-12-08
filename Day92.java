package pkg100daycodingisc;

import java.util.Scanner;

public class Day92 {
    public static int Luas(int panjang, int lebar) {
        return panjang * lebar;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int p = sc.nextInt();
        int l = sc.nextInt();
        System.out.println(Luas (p,l));
    }
}
