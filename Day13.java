package EvalusiMentor;
import java.util.Scanner;
public class part4a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Umur saya: ");
        int a = sc.nextInt();
        System.out.print("Tinggi saya: ");
        double b = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Nim saya: ");
        final String c = sc.nextLine();
        
        System.out.printf("%d\n", a);
        System.out.printf("%f\n", b);
        System.out.printf("%s\n", c);
    } 
}
