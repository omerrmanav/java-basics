import java.util.Timer;
import java.util.TimerTask;


public class App {
    static Timer timer = new Timer();
    static TrafficLight light = TrafficLight.GREEN;
    public static void main(String[] args) {
        
        timer.schedule(new TimerTask() {
            public void run(){
                switch(light){
                    case GREEN:
                    System.out.println("GEÇ");
                    light = TrafficLight.YELLOW;
                    break;
        
                    case YELLOW:
                    System.out.println("YAVAŞLA !");
                    light = TrafficLight.RED;
                    break;
        
                    case RED:
                    System.out.println("DUR !!!");
                    light = TrafficLight.GREEN;
                    break;
                }
                System.out.println();
            }
        } ,0 , 2000);
        
    }
}
