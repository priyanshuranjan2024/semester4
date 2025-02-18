package lab8;

class SharedResource {
    synchronized void printNumbers(String threadName) {
        System.out.println(threadName + " is executing...");
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - " + i);
            try {
                Thread.sleep(500); // Simulating some processing delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(threadName + " has finished execution.\n");
    }
}


class MyThread extends Thread {
    SharedResource resource;
    String threadName;

    MyThread(SharedResource resource, String threadName) {
        this.resource = resource;
        this.threadName = threadName;
    }

    public void run() {
        resource.printNumbers(threadName);
    }
}

public class ques2 {

    public static void main(String[] args) {
        SharedResource obj = new SharedResource();

        MyThread t1 = new MyThread(obj, "Thread 1");
        MyThread t2 = new MyThread(obj, "Thread 2");

        t1.start();
        t2.start();
    }
    
}
