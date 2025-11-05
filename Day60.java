package pkg100daycodingisc;
import java.util.Scanner;
public class Day60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();
        
        for (int i = N; i >= 1; i--) {
            if (i % 2 == 1) {
                System.out.println(i); 
            } 
        }
        System.out.println();
        
        for (int i = N; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
                
            }
            
        }
    }
    
}
