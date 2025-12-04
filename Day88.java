package pkg100daycodingisc;

import java.util.Scanner;

public class Day88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String buah [] = new String [5];
        
        for (int i = 0; i < buah.length; i++) {
            buah[i] = sc.nextLine();
            
        }
        for (String tamp : buah) {
            System.out.print(tamp + " ");
            
        }
                    
        }
    }
