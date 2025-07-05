
 enum TrafficLight {
    RED(30) {
        @Override
        public void displayBehavior() {
            System.out.println("STOP! The light will be red for " + getDuration() + " seconds.");
        }
    },
    YELLOW(5) {
        @Override
        public void displayBehavior() {
            System.out.println("CAUTION! The light will be yellow for " + getDuration() + " seconds.");
        }
    },
    GREEN(45) {
        @Override
        public void displayBehavior() {
            System.out.println("GO! The light will be green for " + getDuration() + " seconds.");
        }
    };

    private final int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public abstract void displayBehavior();
}
public class TrafficLightDemo{
    public static void main(String[] args) {
    
        TrafficLight red = TrafficLight.RED;
        red.displayBehavior();

        TrafficLight yellow = TrafficLight.YELLOW;
        yellow.displayBehavior();

        TrafficLight green = TrafficLight.GREEN;
        green.displayBehavior();
    }
}
