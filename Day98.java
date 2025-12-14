package pkg100daycodingisc;

import java.util.Scanner;

public class Day98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tamp1 = 0;
        int tamp2 = 1;
        
        for (int i = 0; i < n; i++) {
            System.out.print(tamp1 + " ");
            
            int tamp3 = tamp1 + tamp2;
            tamp1 = tamp2;
            tamp2 = tamp3;
            
        }
    }
    
}
