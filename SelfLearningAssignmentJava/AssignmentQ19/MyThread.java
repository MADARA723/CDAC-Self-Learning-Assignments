package AssignmentQ19;

public class MyThread extends Thread{

	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
			
			try
			{
				Thread.sleep(1000);//delay does not release loack
			}catch(Exception e)
			{
				
			}
			Thread.yield();
		}
	}
}
