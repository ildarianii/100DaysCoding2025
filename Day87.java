package pkg100daycodingisc;

import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();
        int a [] = {10, 20, 30, 40, 50, 60};
        boolean tamp = false;
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] == angka) {
                System.out.printf("%d adalah elemen array index ke-%d\n", angka, i);
                tamp = true;
                break;
                
            }else{
                tamp = false; 
            }
        }
        System.out.println(tamp);
        
    }
    
}
