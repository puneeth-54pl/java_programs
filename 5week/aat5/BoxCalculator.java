import java.util.Scanner;
class Box{
    double w,h,d;
    Box(double w,double h,double d){
        this.w=w;
        this.h=h;
        this.d=d;
    }
    public  double calculateVolume() {
        return w * h * d;
    }
    public double calculateSurfaceArea() {
        return 2 * (w * h + h * d + d * w);
    }
}

public class BoxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width (w): ");
        double w = scanner.nextDouble();
        System.out.print("Enter the height (h): ");
        double h = scanner.nextDouble();
        System.out.print("Enter the depth (d): ");
        double d = scanner.nextDouble();
        Box b1= new Box(w,h,d);
        double volume = b1.calculateVolume();
        double surfaceArea = b1.calculateSurfaceArea();
        System.out.println("Volume of the box: " + volume);
        System.out.println("Surface area of the box: " + surfaceArea);
        scanner.close();
    }
}
