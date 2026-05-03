
/*
Q28. Create multiple threads using lambda expression
*/
package AsssgnmentQ25;

public class ThreadsLambda {
    public static void main(String[] args) {

        // Thread 1 using lambda
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(500); // pause
                } catch (Exception e) {}
            }
        });

        // Thread 2 using lambda
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2: " + i);
                try {
                    Thread.sleep(700); // pause
                } catch (Exception e) {}
            }
        });

        // Thread 3 using lambda
        Thread t3 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 3: " + i);
                try {
                    Thread.sleep(600); // pause
                } catch (Exception e) {}
            }
        });

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
    }
}