package pkg100daycodingisc;
public class Day34 {
    public static void main(String[] args) {
        int angka1 = 14;
        int angka2 = 9;
        int angka3 = 4;
        
        // penugasan + aritmatika
        angka3 += angka1 * angka2;
        
        System.out.println(angka3);
        
        // perbandingan
        System.out.println(angka3 > angka1);
        
        // increment & decrement
        angka1++;
        angka3--;
        
        System.out.println("Hasil increment: " + angka1);
        System.out.println("Hasil decrement: " + angka3);
        
        // logika
        System.out.println(angka1 < angka3 && angka2 > angka1);
        System.out.println(angka1 < angka3 || angka2 > angka1);
        
    }
    
}
