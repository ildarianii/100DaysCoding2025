import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String imp = sc.nextLine();
       
        if (imp.equalsIgnoreCase("ilda riani")) {
            System.out.println("Nama anda " + imp);
            System.out.println("Panjang inputan = " + imp.length());
        }
        if (imp.equals("saya suka matcha")){
            System.out.println(imp.toUpperCase());
            System.out.println("Panjang inputan = " + imp.length());
        }
        
    }
    
}
