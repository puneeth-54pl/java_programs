import Clear.Mainclear;

public class Testclear {
    public static void main(String[] args) {
        System.out.println("This text will be cleared in 2 seconds...");
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        Mainclear.clrscr(); 
        Mainclear.starline();
        System.out.println("Screen cleared!");
        Mainclear.starline();
    }
}