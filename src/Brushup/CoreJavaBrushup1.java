package Brushup;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		char letter = 'k';
		String name = "Karthik";
		System.out.println(name);
		
		int[] numb = new int[5];
		numb[0] = 2;
		numb[1] = 3;
		numb[2] = 4;
		numb[3] = 5;
		numb[4] = 7;
		
		for(int i=0; i<numb.length; i++)
		{
			if(numb[i]%2==0)
			{
				System.out.println(numb[i] + " is divisble by 2");
			}
			else
			{
				System.out.println(numb[i] + " Not divisbile by 2");
			}
		}
		
		int[] arr = {1,4,7,8,3};
		System.out.println(arr[1]);
		
		ArrayList<String>  a = new ArrayList<String>();
		a.add("Karthik");
				
	}

	public void getUserdata() {
		// TODO Auto-generated method stub
		
	}
	}