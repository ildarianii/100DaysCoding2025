package pkg100daycodingisc;

import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka M: ");
        int M = sc.nextInt();
        
        System.out.print("Masukkan angka N: ");
        int N = sc.nextInt();
        
        int vt = 1;
        for (int i = 1; i <= N; i++) {
            vt = vt * M;
            
        }
        System.out.println(M + " Pangkat " + N + " = " + vt);
    }
    
}
