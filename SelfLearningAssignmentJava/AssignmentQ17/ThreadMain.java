package AssignmentQ17;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // 🔹 Using Thread class
        ThreadA t1 = new ThreadA();
        t1.start();

        // 🔹 Using Runnable interface
        RunnableA r = new RunnableA();
        Thread t2 = new Thread(r);
        t2.start();

	}

}
