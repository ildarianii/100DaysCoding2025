package pkg100daycodingisc;
public class Day76 {
    public static void main(String[] args) {
     String a = "Ilda Riani";
     String b = "ilda riani";
     String c = "Ria";
     
        System.out.println(a.equals(b));
        System.out.println(b.equalsIgnoreCase(a));
        System.out.println(a.contains(c));
        System.out.println(a.isEmpty());
    }
}
