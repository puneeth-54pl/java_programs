class TrafficLight extends Thread {
    String color;
    int delay;


    TrafficLight(String color, int delay) {
        this.color = color;
        this.delay = delay;
    }
    @Override
    public void run() {
        try {
            System.out.println(color + " light is ON");
            Thread.sleep(delay);
         } catch (InterruptedException e) {
            System.out.println("Interrupted: " + e.getMessage());
         }
    }
}

public class TrafficSimulation {
    public static void main(String[] args) {
        
            new TrafficLight("Red", 3000).start();
            try { Thread.sleep(3000); } catch (Exception e) {}

            new TrafficLight("Green", 2000).start();
            try { Thread.sleep(2000); } catch (Exception e) {}

            new TrafficLight("Yellow", 1000).start();
            try { Thread.sleep(1000); } catch (Exception e) {}
        
    }
}
