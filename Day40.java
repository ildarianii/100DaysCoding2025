package pkg100daycodingisc;

import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        double angka1 = sc.nextDouble();
        
        System.out.print("Masukkan operator (+,-,*,/): ");
        char op = sc.next().charAt(0);
        
        System.out.print("Masukkan angka kedua: ");
        double angka2 = sc.nextDouble();
        
        double hasil;
        
        if (op == '+') {
            hasil = angka1 + angka2;
            System.out.println("Hasil = "+ hasil);
            
        }else if (op == '-') {
            hasil = angka1 - angka2;
            System.out.println("Hasil = "+ hasil); 
            
        }else if (op == '*') {
            hasil = angka1 * angka2;
            System.out.println("Hasil = "+ hasil); 
            
        }else if (op == '/') {
            hasil = angka1 / angka2;
            System.out.println("Hasil = "+ hasil); 
            
        }else{
            System.out.println("Tidak valid!!!");
        }
          
    }
}
  
