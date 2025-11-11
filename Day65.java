import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        int vt = 1;
        
        for (int i = 1; i <= angka; i++) {
            vt = vt * i;
            
        }
        System.out.printf("%d! = %d", angka, vt);
        System.out.println();
    }
    
}
