package AssignmentQ1;

class Employee{
	private int id;
	private String name;
	private double salary;
	
	public Employee()
	{
		id=0;
		name=null;
		salary=0.0;
     		
	}
//	public Employee(int id,String name,double salary)
//	{
//		this.id=id;
//		this.name=name;
//		this.salary=salary;
//		
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
	    return id + " " + name + " " + salary;
	}
}

public class EncapsulateQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setId(1);
		e.setName("Asit");
		e.setSalary(50000);
		
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());

	}

}
