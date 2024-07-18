package sel.bootcamp.part1_DifficultSection;

public class JavaQ_Thread {
    public static void main(String[] args) {
        // Creating and starting two threads
        Thread thread1 = new MyThread("Thread 1");
        Thread thread2 = new MyThread("Thread 2");
        
        thread1.start();
        thread2.start();
        
        // Main thread continues to run concurrently
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread executing: " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Custom thread class
class MyThread extends Thread {
    private String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + " executing: " + i);
            try {
                Thread.sleep(1500); // Pause for 1.5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
