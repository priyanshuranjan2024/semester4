package lab8;

class CounterThread extends Thread {
    private int lower, upper;

    public CounterThread(String name, int lower, int upper) {
        super(name);
        this.lower = lower;
        this.upper = upper;
    }

    public void run() {
        System.out.println("Thread - " + getName());
        for (int i = lower; i <= upper; i++) {
            System.out.println("Counter - " + i);
            try {
                Thread.sleep(5); // 5 milliseconds delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ques1 {

    public static void main(String[] args) {
        CounterThread t1 = new CounterThread("First", 10, 15);
        t1.start();
    }
    
}
