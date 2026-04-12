package AssignmentQ1;

public class StringManipulationsQ4 {
	public static void main(String []args)
	{
		//String(Immutable)
		//->cannot change original object
		
		System.out.println("String\n");
		
		String s= "Hello";
		
		s.concat(" World"); //Original Not change
		System.out.println(s);
		
		s=s.concat(" World");
		System.out.println(s);
		
		
		
		//StringBuffer (Mutable+Thread Safe)
		//modifies same object
		System.out.println("\n String Buffer \n");
		StringBuffer sb=new StringBuffer("Hello");
		
		sb.append(" World"); //Modifies directly
		System.out.println(sb);
		
		sb.insert(5," Asit's");
		System.out.println(sb);
		
		sb.replace(0, 5, "Hii");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.delete(8, 16);
		System.out.println(sb);
		
		System.out.println(" \n StringBuilder \n");
		
        //StringBuilder (Mutable + Faster)
        //Same as StringBuffer but not synchronized
		
		StringBuilder sb2 = new StringBuilder("Hello");

		sb2.append(" World");
		sb2.reverse();

		System.out.println(sb2);
		
	}

}
