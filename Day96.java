package pkg100daycodingisc;

import java.util.Scanner;

public class Day96 {
    public static int aritma(int angka1, int angka2, char op) {
        switch(op){
            case '+':
                return angka1 + angka2;
            case '-':
                return angka1 - angka2;
            case '*':
                return angka1 * angka2;
            case '/':
                return angka1 / angka2;
            default:
                System.out.println("Skip, ga kenal!");
                return 0; 
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int angkaa1 = sc.nextInt();
        System.out.print("Pilih operasi (+, -, *, /): ");
        char operasi = sc.next().charAt(0);
        System.out.print("Masukkan angka kedua: ");
        int angkaa2 = sc.nextInt();
        
        System.out.println("Hasil = " + aritma(angkaa1,angkaa2, operasi));
    }
    
}
