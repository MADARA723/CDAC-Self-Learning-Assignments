package OOPConceptsQ6;

public class MainOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e;
		
		e=new Manager();
		e.setId(1);
		e.setName("Asit");
		System.out.println("ID: "+e.getId() + ", Name: "+e.getName() );
		e.calculateSalary();
		
		
		e=new Developer();
		e.setId(2);
		e.setName("Satish");
		System.out.println("ID: "+e.getId() + ", Name: "+e.getName() );
		e.calculateSalary();

	}

}
