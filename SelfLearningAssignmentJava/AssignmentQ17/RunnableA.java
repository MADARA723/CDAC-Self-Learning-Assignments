package AssignmentQ17;

public class RunnableA implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=5;i++)
		{
			System.out.println("In Runnable Class: "+ i);
		}
		
	}

}
