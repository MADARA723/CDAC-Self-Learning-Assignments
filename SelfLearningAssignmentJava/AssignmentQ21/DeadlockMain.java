package AssignmentQ21;
//23.Create a Deadlock class to demonstrate deadlock in multithreading
//environment.
public class DeadlockMain {

    public static void main(String[] args) {

        Deadlock obj = new Deadlock();

        Thread t1 = new Thread(() -> obj.methodA());
        Thread t2 = new Thread(() -> obj.methodB());

        t1.start();
        t2.start();
    }
}
