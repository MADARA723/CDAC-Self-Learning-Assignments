package AssignementQ20;

//22.Understand sleep , join , yield methods.

public class MainThread {

    public static void main(String[] args) throws Exception {

        SimpleThreadEx t1 = new SimpleThreadEx();
        SimpleThreadEx t2 = new SimpleThreadEx();

        t1.start();   // start first thread

        t1.join();    // join → wait until t1 completes

        t2.start();   // start second thread
    }
}