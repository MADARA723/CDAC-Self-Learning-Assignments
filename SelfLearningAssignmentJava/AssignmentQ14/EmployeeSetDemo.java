package AssignmentQ14;

import java.util.*;

public class EmployeeSetDemo {

	public static void main(String[] args) {
		
		HashSet<Employee> set=new HashSet<Employee>();

		set.add(new Employee(1,"Asit"));
		set.add(new Employee(2,"Sashi"));
		set.add(new Employee(3,"Rohan"));
		set.add(new Employee(1,"Asit"));//Set object takes only unique values
		
		System.out.println("Employee in HashSet: ");
		
		for(Employee e:set)
		{
			System.out.println(e);
		}
	}

}
