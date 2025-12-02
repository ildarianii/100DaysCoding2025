package pkg100daycodingisc;

import java.util.Scanner;

public class Day86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array [] = new int [5];
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("Masukkan nilai ke-%d: ", i + 1);
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < 5; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
