abstract class Marks {
    int max=100;
    abstract double getPercentage();
}
class A extends Marks {
    int m1, m2, m3;
    A(int m1, int m2, int m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    @Override
    double getPercentage() {
        return (m1 + m2 + m3)*100 / (max*3);
    }
}
class B extends Marks {
    int m1, m2, m3, m4;
    B(int m1, int m2, int m3, int m4) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
    }
    @Override
    double getPercentage() {
        return (m1 + m2 + m3+m4)*100 / (max*4);
    }
}
public class  Student {
    public static void main(String[] args) {
        A s1 = new A(75, 81, 80);
        B s2 = new B(92, 72, 98, 89);

        System.out.println("Percentage of Student A: " + s1.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + s2.getPercentage() + "%");
    }
}
