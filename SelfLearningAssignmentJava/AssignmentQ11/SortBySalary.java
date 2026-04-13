package AssignmentQ11;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return Double.compare(e1.salary,e2.salary);
	}

}
