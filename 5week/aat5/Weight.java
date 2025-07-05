public class Weight {
    private int pound;

    public Weight() {
        this.pound = 1000;
    }
    public Weight(int pound) {
        this.pound = pound;
    }
    public double toKilograms() {
        return pound * 0.453592;
    }

    public int getPound() {
        return pound;
    }

    public void setPound(int pound) {
        this.pound = pound;
    }

    public static void main(String[] args) {
        Weight w = new Weight(); 
        System.out.println("Weight in pounds: " + w.getPound());
        System.out.println("Weight in kilograms: " + w.toKilograms());
        w.setPound(500);
        System.out.println("New Weight in pounds: " + w.getPound());
        System.out.println("New Weight in kilograms: " + w.toKilograms());
    }
}
