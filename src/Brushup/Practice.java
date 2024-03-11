package Brushup;

import java.util.Arrays;
import java.util.List;
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] name = {"Karthik","Raja","Core","Java"};
		
		for(String s:name)
		{
			System.out.println(s);
		}
		
		List<String> nameArray = Arrays.asList(name);
		System.out.println(nameArray.contains("Raja"));
		
		System.out.println("****************");
		
		Practice p = new Practice();
		int k = p.getData();
		System.out.println(k);
		
		CoreJavaBrushup1 c = new CoreJavaBrushup1();
		c.getUserdata();
		
		getuserName();

	}
	
	public int getData()
	{
		System.out.println("Hello World");
		return 31;
	}
	
	public static void getuserName()
	{
		System.out.println("Username: karthikraja31101996@gmail.com");
	}
}
