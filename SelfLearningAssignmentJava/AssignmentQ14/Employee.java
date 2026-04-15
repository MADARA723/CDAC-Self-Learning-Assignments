package AssignmentQ14;
//17.Create an Employee HashSet collection and override equals &hashCode
//methods to understand how the set maintains uniqueness using these
//methods.

import java.util.Objects;

public class Employee {

	int id;
	String name;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public Employee(int id,String name)
	
	{
		this.id=id;
		this.name=name;
		 
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id,name);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this==obj)
		{
			return true;
		}
		if(obj==null||getClass()!=obj.getClass())
		{
			return false;
		}
		
		Employee e=(Employee)obj;
		
		
		return this.id==e.id && this.name.equals(e.name) ;
	}
	
}
