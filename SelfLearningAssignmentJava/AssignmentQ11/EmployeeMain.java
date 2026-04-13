package AssignmentQ11;
import java.util.*;

public class EmployeeMain {

	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList();
		
		//Inserting

		list.add(new Employee(1,"Asit",500000));
		list.add(new Employee(2,"Shashi",600000));
		list.add(new Employee(3,"Rohan",200000));
		
		//Sort using Comparable(by ID)
		
		Collections.sort(list);
		System.out.println("Sorted by ID : ");
		for(Employee e:list)
		{
			System.out.println(e);
			
		}
		
		//Sort using Comparator(by Name)
		
		Collections.sort(list,new SortByName());
		System.out.println("Sorted by Name : ");
		for(Employee e:list)
		{
			System.out.println(e);
		}
		
//		//Sort using Comparator(by Salary)
		Collections.sort(list,new SortBySalary());
		System.out.println("Sorted by Salary: ");
		for(Employee e:list)
		{
			System.out.println(e);
		}


	}

}
