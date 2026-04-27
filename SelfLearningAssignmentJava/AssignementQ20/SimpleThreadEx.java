package AssignementQ20;

public class SimpleThreadEx extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            // print thread name + step
            System.out.println(Thread.currentThread().getName() + " : " + i);

            try {
                Thread.sleep(500);   // sleep → pause current thread
            } catch (Exception e) {}

            Thread.yield();          // yield → give chance to other threads
        }
    }
}