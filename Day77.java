package pkg100daycodingisc;
public class Day77 {
    public static void main(String[] args) {
    String a = "Saya suka matchaa";
    String b = "   Saya suka matchaa   ";
        
        String replace = a.replace("suka", "cinta");
        System.out.println("Replace: " + replace);
        
        String trim = b.trim();
        System.out.println("Trim: " + trim);
        
        String substring = a.substring(5, 16);
        System.out.println("Substring: " + substring);
    }
    
}

 
