import java.util.Scanner;

class Bin2Dec{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary string:");
        String bString=sc.nextLine();
        int digi=0;
        for(int i=0;i<bString.length();i++){
            if(bString.charAt(i)=='1'){
                digi=digi+(int)Math.pow(2,(bString.length()-1-i));
            }
        }
        System.out.printf("The equivalent decimal number for binary %s is:%d",bString, digi);
        
    }
}