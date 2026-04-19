package AssignmentQ19;

public class ThreadMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MyThread t1 =new MyThread();
		MyThread t2 =new MyThread();
		
		t1.start();
		
		t1.join();//waits till t1 that is 1 sec is finished
		
		t2.start();

	}

}
