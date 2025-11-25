package pkg100daycodingisc;

import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uss;
        String pas;
        
        do{
            System.out.print("Masukkan username: ");
            uss = sc.nextLine();
            System.out.print("Masukkan password: ");
            pas = sc.nextLine();
            if (!uss.equals("ildarianii") && !pas.equals("indaa1234")) {
                System.out.println("Username atau Password salah, silahkan coba lagi!\n"); 
            }
        }while(!uss.equals("ildarianii") && !pas.equals("indaa1234"));
         System.out.println("Login berhasil! selamat datang^^");
    }
}
