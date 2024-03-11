import java.util.ArrayList;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr = {1,2,3,6,7,9,10,14,20};
//		
//		int count = 0;
//		for(int i=0; i<arr.length; i++)
//		{
//			if (arr[i] % 2 == 0)
//					{
//			System.out.println(arr[i]);
//			count++;
//					}
//			
//		}
//		System.out.println(count +"is count which are divisible by 2");
		
		// Arraylist
		ArrayList<String> a = new ArrayList<String>();
		a.add("Karthik");
		a.add("Raja");
		a.add("Banu");
		a.add("Priya");
		System.out.println(a.get(3));
		
		for(int i=0; i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("***********");
		for(String val:a)
		{
			System.out.println(val);
		}
		
	}

}

