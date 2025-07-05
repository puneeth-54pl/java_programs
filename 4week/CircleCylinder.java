
class Circle {

    private double radius;
    private String color = "red";

    Circle() {
        this.radius = 1.0;
        this.color = "blue";
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return 3.14 * this.radius * this.radius;
    }

    public String toString() {
        return ("Circle [radius=" + this.radius + ", color=" + this.color
                + "]");
    }
}

class Cylinder extends Circle {

    double height;

    Cylinder() {
        super();
        this.height = 1.0;

    }

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;

    }

    Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        double baseArea = super.getArea();
        double sideArea = 2 * 3.14 * getRadius() * height;
        return 2 * baseArea + sideArea;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

}

class CircleCylinder {

    public static void main(String[] args) {
        Cylinder c = new Cylinder(2.0, 5.0, "blue");
        System.out.println(c);

        System.out.println("Cylinder radius:" + c.getRadius());
        c.setRadius(3.0);
        System.out.println("new radius:" + c.getRadius());
        System.out.println("Volume:" + c.getVolume());
        System.out.println("Area:" + c.getArea());
        System.out.println("Height:" + c.getHeight());
        c.setHeight(4.0);
        System.out.println("New Height:" + c.getHeight());
        System.out.println("Color:" + c.getColor());
        c.setColor("green");
        System.out.println("new color:" + c.getColor());
        System.out.println("Volume = " + c.getVolume());
        System.out.println("Cylinder details:" + c);
    }
}
