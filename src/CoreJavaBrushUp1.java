
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		String website = "www.amazon.in";
		char letter = 'k';
		double dec = 4.99;
		boolean card = true;
		
		System.out.println(num+" is the number");
		System.out.println(website);
		System.out.println(letter);
		System.out.println(dec);
		System.out.println(card);
		
		//Array Introduction
		
		int[] arr = new int[5];
		arr[0] = 2;
		arr[1] = 3;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 6;
		
		int[] arr1 = {1,2,3,4,5};
		System.out.println(arr1);
		
		// For Loop
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		String[] name = {"karthik","banu"};
		
		for (int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		for(String s : name)
		{
			System.out.println(s);
		}

	}

}
