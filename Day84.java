package pkg100daycodingisc;

import java.util.Scanner;

public class Day84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();
        int tmp = 0;
        
        for (int i = 1; i <= angka; i++) {
            if (i % 2 == 1) {
                tmp += i; 
            }
        }
        System.out.println(tmp);
        
    }
    
}
