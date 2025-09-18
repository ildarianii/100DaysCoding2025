package pkg100daycodingisc;
import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Nama: ");
        String nama = i.nextLine();
        System.out.println("No WhatsApp: ");
        long no = i.nextLong();
        
        System.out.println("Nama: " + nama);
        System.out.println("No WhatsApp: " + no);
        i.close();
    }
}
