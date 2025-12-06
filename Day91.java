package pkg100daycodingisc;

import java.util.Scanner;

public class Day91 {
    public static String Nama(String depan, String belakang) {
        return depan + " " + belakang;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(Nama(a, b));
    }
}
