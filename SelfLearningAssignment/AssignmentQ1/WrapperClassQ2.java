package AssignmentQ1;

//2. Use different methods of java defined wrapper classes.
public class WrapperClassQ2 {
	
	/**
	   Integer
	   Boolean
	   Double
	   Character
	 */
	public static void main(String [] agrs)
	{
		Integer num=100;
		Double d=23.3;
		Character ch='A';
		
		Integer obj=Integer.valueOf(10);
		System.out.println("Value int the object obj : "+obj);
		
		//Converting String into Integer using Integer Wrapper class and using parseInt method
		int x=Integer.parseInt("123");
		System.out.println("Value int the variable x : "+x);
		
		//Converting String into Double using Double Wrapper class and using parseDouble method
		double e=Double.parseDouble("234");
		System.out.println("Value Double the variable e : "+e);

		//Converting int num variable into string 
		String s=num.toString();
		System.out.println("Value into String variable s : "+s);
		
		//Compares the values if the given value is less than previous value then ans 1 and when  value is equal then comparison is 0
		//and value is more then given value then ans is -1
		int com1=num.compareTo(20);
		System.out.println("Comparison : "+com1);
		
		int com2=num.compareTo(100);
		System.out.println("Comparison : "+com2);
		
		int com3=num.compareTo(200);
		System.out.println("Comparison : "+com3);
		
		//equals() 	checks eqality give boolean value
		
		boolean eq1=num.equals(10);
		System.out.println("Is 100 equals 10 : "+eq1);
		
		boolean eq2=num.equals(100);
		System.out.println("Is 100 equals 100 : "+eq2);
		
		//Character wrapper class methods
		boolean iD=Character.isDigit('5');
		System.out.println(iD);
		boolean iL=Character.isLetter('A');
		System.out.println(iL);
		
		char se=Character.toLowerCase('A');
		System.out.println("Coverts Uppercase letters into lowercase A: "+se);
		
		
	}

}
