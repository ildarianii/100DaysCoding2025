package pkg100daycodingisc;

import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();
        
        System.out.print("Masukkan nilai M: ");
        int M = sc.nextInt();
        
        
        for (int i = 1; i <= N; i++) {
            if (i % M == 0) {
                System.out.println(i);
            }
            
        }
    }
    
}
