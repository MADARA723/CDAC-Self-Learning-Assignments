package AssignmentQ18;

public class MainTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SampleTask t1=new SampleTask();
		SampleTask t2=new SampleTask();
		SampleTask t3=new SampleTask();
		
		t1.start();
		t2.start();
		t2.start();
		
		NumberTask n=new NumberTask();
		AlphaTask a=new AlphaTask();
		
		n.start();
		a.start();


	}
	

}
