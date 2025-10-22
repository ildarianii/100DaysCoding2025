package pkg100daycodingisc;

import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode hari (1,2,3): ");
        int hari = sc.nextInt();
        
        switch (hari){
            case 1 :
                System.out.println("Senin");
            break;
            case 2 : 
                System.out.println("Selasa");
            break;
            case 3 :
                System.out.println("Rabu");
            break;
            
            default :
                System.out.println("KODE HARI TIDAK DITEMUKAN");
            break;
        }
    }
}
