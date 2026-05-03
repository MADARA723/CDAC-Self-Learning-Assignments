package AssignmentQ23;

//25.Demonstrate how to share threadlocal data between multiple threads.

class MyThread1 extends Thread {

    // ThreadLocal variable
    private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 0);

    public void run() {
        threadLocal.set((int)(Math.random() * 100)); // set value

        System.out.println(Thread.currentThread().getName() +
                " Value: " + threadLocal.get());

        threadLocal.remove(); // cleanup
    }
}

public class THreadLocal {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();
        MyThread1 t3 = new MyThread1();

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}