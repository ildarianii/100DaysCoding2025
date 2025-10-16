package pkg100daycodingisc;

import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== MENU TOKO HELLO WORLD ===");
        System.out.println("1. Roti -- Rp5.000");
        System.out.println("2. Matcha -- Rp25.000");
        System.out.println("3. Kopi -- Rp15.000");
        System.out.println("4. Teh -- Rp12.000");
        
        System.out.print("Masukkan pilihan anda disini^^: ");
        int menu = sc.nextInt();
        if (menu == 1) {
            double harga = 5.000;
            System.out.printf("Anda membeli Roti seharga Rp%.3f\n", harga);
            System.out.println("Terimakasih sudah berbelanja:)");
            
        }else if (menu == 2){
            double harga = 25.000;
            System.out.printf("Anda membeli Matcha seharga Rp%.3f\n", harga);
            System.out.println("Terimakasih sudah berbelanja:)");
        
        
        }else if (menu == 3){
            double harga = 15.000;
            System.out.printf("Anda membeli Kopi seharga Rp%.3f\n", harga);
            System.out.println("Terimakasih sudah berbelanja:)");
        
        
        }else if (menu == 4){
            double harga = 12.000;
            System.out.printf("Anda membeli Teh seharga Rp%.3f\n", harga);
            System.out.println("Terimakasih sudah berbelanja:)");
            
        }else{
            System.out.println("Maaf, plihan anda tidak tersedia pada menu:(");
        }  
    }
    
}
