package AssignmentQ15;

import java.util.*;

public class GenericDemo {

	private static void printList(List<? extends Number> list) {
		
		System.out.println("Using  ? extends: ");
		for (Number n:list)
		{
			System.out.println(n);
		}
		
	}
	
	private static void addElements(List<? super Integer> list) {
		System.out.println("Using ? super: ");
		list.add(10);
		list.add(20);
		System.out.println(list);
		
		
	}
	
	private static void showAny(List<?> list) {
		System.out.println("Using ? (any type):");
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		
		
	}
	public static void main(String[] args) {
		
		List<Integer> intList=new ArrayList<>();
		intList.add(1);
		intList.add(2);
		
		List<Double>doubleList=new ArrayList<>();
		doubleList.add(10.5);
		doubleList.add(20.5);
		
		
		List<Object>objList=new ArrayList<>();
		
		// ? extends
		
		printList(intList);
		printList(doubleList);
		
		// ?super
		addElements(objList);
		
		//?
         showAny(intList);
         showAny(doubleList);

	}

}
