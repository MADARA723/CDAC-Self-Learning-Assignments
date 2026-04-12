package AssignmentQ1;
//1. Create sample classes to understand boxing & unboxing.

public class BoxingUnboxingQ1 {
	
	
	public void main(String[] agrs) {
	int x=10;
	
	//Primitive class is wrapper class Integer stores 
	//which stores primitive value in the object which is also called Boxing
	Integer obj=x;
	
	System.out.println(obj); 
	//Unboxing is taking out value from wrapper class oject obj and storing in primitive variable
	int y=obj;
	
	System.out.println(y);
	
	}
}
