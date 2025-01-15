package lab5;



interface Motor {
    int capacity = 5;

    void run();
    void consume();
}

class WashingMachine implements Motor {
    public void run() {
        System.out.println("Capacity of the motor is " + capacity);
    }

    public void consume() {
        System.out.println("Consuming power");
    }
}


public class ques2 {

    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine();
        wm.run();
        wm.consume();
        
    }
    
}
