package AssignmentQ21;

public class Deadlock {

    // two shared resources
    Object resource1 = new Object();
    Object resource2 = new Object();

    // Thread 1 method
    public void methodA() {

        synchronized (resource1) {  // lock resource1
            System.out.println("Thread-1 locked resource1");

            try { Thread.sleep(100); } catch (Exception e) {}

            synchronized (resource2) {  // waiting for resource2
                System.out.println("Thread-1 locked resource2");
            }
        }
    }

    // Thread 2 method
    public void methodB() {

        synchronized (resource2) {  // lock resource2
            System.out.println("Thread-2 locked resource2");

            try { Thread.sleep(100); } catch (Exception e) {}

            synchronized (resource1) {  // waiting for resource1
                System.out.println("Thread-2 locked resource1");
            }
        }
    }
}