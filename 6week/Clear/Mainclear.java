
package Clear;

public class Mainclear {
    public static void clrscr() {
        // Simple ANSI escape code to clear screen
        // Works on most Unix terminals and modern Windows terminals
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public static void starline() {
        System.out.println("***************");
    }
}