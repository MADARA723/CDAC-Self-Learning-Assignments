package AssignmentQ9;

import java.time.LocalDate;
import java.util.Scanner;

public class DateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first Date (dd/MM/yyyy): ");
		String d1=sc.nextLine();
		
		System.out.println("Enter Second Date (dd/MM/yyyy): ");
		String d2=sc.nextLine();
		
		LocalDate date1=DateManipulator.stringToDate(d1);
		LocalDate date2=DateManipulator.stringToDate(d2);

		System.out.println("Date1: " + DateManipulator.dateToString(date1));
        System.out.println("Date2: " + DateManipulator.dateToString(date2));
        
        int days = DateManipulator.daysBetween(date1, date2);
        System.out.println("Days between: " + days);

        sc.close();	
	}

}
