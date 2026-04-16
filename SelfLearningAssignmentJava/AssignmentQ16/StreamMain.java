package AssignmentQ16;

import java.util.*;

public class StreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(23,12,45,23,34);
		
		System.out.println("Original List: "+list);
		
		System.out.println("Map (Square"+
		                      StreamOperations.mapExample(list));

		System.out.println("Reduce (sum): +"
				+ StreamOperations.areduce(list));
		
		
	    System.out.println("Count :" + StreamOperations.counta(list));
	    
	    
	    System.out.println("Sort :"+ StreamOperations.sorting(list));
	    
	    System.out.println("Filter it Even"+ StreamOperations.filtering(list));
	    
	    
	    
	    
	}

}
