package pkg100daycodingisc;
import java.util.Scanner;
public class Day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Nama Anda: ");
        String a = sc.nextLine();
        System.out.println("Tempat, Tanggal Lahir: ");
        String b = sc.nextLine();
        System.out.println("Alamat: ");
        String c = sc.nextLine();
        System.out.println("Nomor Telepon: ");
        Long d = sc.nextLong();
        
        System.out.println("Masukkan Nama Anda: " + a);
        System.out.println("Tempat, Tanggal Lahir: " + b);
        System.out.println("Alamat: " + c);
        System.out.println("Nomor Telepon: " + d);
    }
}
