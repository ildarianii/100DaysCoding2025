package pkg100daycodingisc;

import java.util.Scanner;

public class Day97 {
    public static int Luas(int sisi) {
        return sisi * sisi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ss = sc.nextInt();
        System.out.println(Luas(ss));
    }
    
}
