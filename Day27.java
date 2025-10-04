package pkg100daycodingisc;

import java.util.Scanner;

public class Day27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka1 = sc.nextInt();
        int angka2 = sc.nextInt();
        
        int luas = angka1 * angka2;
        int keramik = 2*2;
        int JumlahTotalKeramik = luas / keramik;
        
        System.out.println(JumlahTotalKeramik);
    }

}
