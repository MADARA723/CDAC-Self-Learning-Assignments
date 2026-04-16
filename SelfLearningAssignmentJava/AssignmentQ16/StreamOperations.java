package AssignmentQ16;

import java.util.*;
import java.util.stream.Collectors;

public class StreamOperations {
	
	public static List<Integer> mapExample(List<Integer>list)
	{
	//	map ->Stream squared
		return list.stream()
				.map(x->x*x)
				.collect(Collectors.toList());
		
	}
	public static int areduce(List<Integer>list)
	{
		//reduce sum
		return list.stream()
				.reduce(0,(a,b)->a+b);
	}
	
	//Count using stream function
	public static long counta(List<Integer>list)
	{
		return list.stream().count();
	}
	
	//Sorting using stream function
	public static List<Integer> sorting(List<Integer>list)
	{
		
		return list.stream()
				.sorted()
				.collect(Collectors.toList());
	}
	//filter using stream function
	
	public static List<Integer> filtering(List<Integer>list)
	{
		return list.stream()
				.filter(x->x%2==0)
				.collect(Collectors.toList());
	}

}
