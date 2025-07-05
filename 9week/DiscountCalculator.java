import java.util.*;

public class DiscountCalculator {
    public static void main(String[] args) {
        List<Double> prices = Arrays.asList(100.0, 200.0, 150.0);
        double discountRate = 0.10;

        System.out.println("Discounted Prices:");
        for (Double priceObj : prices) {
            double price = priceObj;
            double discount = price * discountRate;
            double finalPrice = price - discount;
            System.out.println("Original: Rs." + price + " | Discounted: Rs." + finalPrice);
        }
    }
}
