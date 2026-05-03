/*
Q27. Create multiple threads using anonymous inner classes
*/
package AssigmentQ24;
public class Anonymousclass {
    public static void main(String[] args) {

        // Thread 1 using anonymous inner class
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread 1: " + i);
                    try {
                        Thread.sleep(500); // pause
                    } catch (Exception e) {}
                }
            }
        };

        // Thread 2 using anonymous inner class
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread 2: " + i);
                    try {
                        Thread.sleep(700); // pause
                    } catch (Exception e) {}
                }
            }
        };



        // Start all threads
        t1.start();
        t2.start();
        
    }
}