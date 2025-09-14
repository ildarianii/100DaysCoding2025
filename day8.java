package pkg100dayscodingday8;
public class Day8 {
    public static void main(String[] args) {
        String a = "Hai,";
        String b = "kamu juga suka matchaa ";
        String c = a + b + "yaa?";
        
        System.out.println(c);
        
        // length() = menghitung jumlah kata
        System.out.println("Jumlah kata: " + c.length());
        // toUpperCase() = Full Kapital
        System.out.println("Kapital: " + c.toUpperCase());
        // toLowerCase() = Full huruf kecil
        System.out.println("Kecil: " + c.toLowerCase());
        // charAt(index) = menentukan suatu huruf
        System.out.println("Huruf ke 2: " + c.charAt(2));
    }
    
}
