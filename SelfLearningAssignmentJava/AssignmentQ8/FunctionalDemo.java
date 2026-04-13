package AssignmentQ8;

//In Functional Interface only one abstract method	
@FunctionalInterface
interface MyOperation{
      int operate(int a,int b);
}
public class FunctionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Anonymous Class
		MyOperation add=new MyOperation()
				{

					@Override
					public int operate(int a, int b) {
						// TODO Auto-generated method stub
						return a+b;
					}
			
				};
				System.out.println("Addition (Anonymous): "+ add.operate(10, 5));
				
				MyOperation multiply=(a,b)->a*b;
				
				System.out.println("Mutiplication (lambda): "+multiply.operate(23, 2));
				
	}

}
