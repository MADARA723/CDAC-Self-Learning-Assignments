package AssignmentQ10;
import java.util.*;

public class WrapperListDemo {

	public static void main(String[] args) {
		
		//Create List
		List<Integer> list=new ArrayList<>();
		System.out.println("\nList is created \n");
		
		//Insert
		System.out.println("\nInsertion \n");
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(5);
		list.add(7);
		System.out.println("After insert : "+list);
		
		//Deletion
		System.out.println("\nDeletion \n");
		list.remove(Integer.valueOf(20));
		System.out.println("Updated list: "+ list);
		
		//Searching
		System.out.println("\nSearching \n");
		if(list.contains(40))
			{
                System.out.println("40 found in list");			
			}
		
		
		//Iteration
		System.out.println("\nIterationn \n");
		for(Integer x: 	list)
		{
			System.out.println(x);
		}
		
		//Sorting
		System.out.println("\nSorting \n");
		Collections.sort(list);
		System.out.println("After Sort "+list);

	}

}
