package AssignmentQ13;

//16.Implement Queue data structure using LinkedList and Queue collection.


import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		//Creating Queue using linkedList
		Queue<Integer> q=new LinkedList<>();
		
		//Insert elements(Enqueue)
		
		q.add(10);
		q.add(20);
		q.add(12);
		q.add(30);
		System.out.println("Queue after insertion: "+q);
		
		//Peek(front element)
		
		System.out.println("Front element: "+ q.peek());
		
		//Delete element(dequeue)
		q.poll();
		System.out.println("Queue element after deletion: "+ q);
		
		//Display suing iteration
		System.out.println("Queue Elements");
		for(Integer x:q)
		{
			System.out.println(x);
		}
		

	}

}
