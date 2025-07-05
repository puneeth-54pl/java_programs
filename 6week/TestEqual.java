import java.util.*;
class NoEqualException extends Exception {
     NoEqualException(String message) {
        super(message);
    }
}

 class TestEqual {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a float number:");
        float value=sc.nextFloat();

        try {
            if (value != 3.14f) {
                throw new NoEqualException("Value is not equal to 3.14");
            } else {
                System.out.println("Value is equal to 3.14");
            }
        } catch (NoEqualException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
