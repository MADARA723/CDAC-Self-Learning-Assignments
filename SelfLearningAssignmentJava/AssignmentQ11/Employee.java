package AssignmentQ11;

public class Employee implements Comparable<Employee> {

	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return this.id-e.id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
