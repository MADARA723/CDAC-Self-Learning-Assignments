package AssignmentQ1;

//3. Create String Demo class and perform different string manipulation
//methods.

public class StringDemoQ3 {

	public static void main(String[] args) {
		String s="Hello Asit";
		
		System.out.println(s.length());
		System.out.println(s.charAt(6));
		//Case Conversion
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		//Searching
		System.out.println(s.indexOf("A"));
		System.out.println(s.lastIndexOf("l"));
		//give boolean
		System.out.println(s.contains("Asit"));
		System.out.println(s.contains("World"));
		
		//substring s.substring(beginingindex,endingindex)
		
		System.out.println(s.substring(0,6));
		
		//Replace
		System.out.println(s);
		System.out.println(s.replace("Asit","Shashi"));
		
		//Trim removes spaces
		String st=" Hello ";
		System.out.println(st.trim());
		
		//split() splits string on the basis of condition in the string
		String str="Java,Python,Sql";
		String[] str1=str.split(",");
		for(String sa:str1)
		{
			System.out.println(sa+" ");
		}
		
		//concatenate concate()
		String sea=s.concat("!!!");
		System.out.println(sea);
        
		//Conversion
		//Converted in string
		System.out.println(String.valueOf(123));
	
	}

}
