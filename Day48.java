package pkg100daycodingisc;

import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int angka1 = sc.nextInt();
        System.out.print("Masukkan operator (+,-,*,/): ");
        char op = sc.next().charAt(0);
        System.out.print("Masukkan angka kedua: ");
        int angka2 = sc.nextInt();
        
        int hasil = 0;
        
        switch (op){
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil= " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil= " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil= " + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println("Hasil= " + hasil);
                break;
                
            default :
                System.out.println("ERROR");
                break;
        }
    }
    
}
