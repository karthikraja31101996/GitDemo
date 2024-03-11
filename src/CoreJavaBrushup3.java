
public class CoreJavaBrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is an object
		//There are two methods to define a string
		//1. String Literal
		//2. By using new keyword
		
		//1. String Literal
		//------------------------------
		String s = "Karthik";
		String s1 = "Karthik";  //If the characters are same, Only one one object(s) is used
		
		//2. By using new keyword
		//------------------------------
		String s2 = new String("Welcome");
		String s3 = new String("Welcome"); //Here eventhough the characters are same, It will create new object due to new keyword
		
		String s4 = "Rahul Shetty Academy";
		String[] splittedString = s4.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		for(int i=s4.length()-1; i>=0; i--)
		{
			System.out.println(s4.charAt(i));
		}
	}
	

}
