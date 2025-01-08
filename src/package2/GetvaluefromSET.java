package package2;

import java.util.Arrays;
import java.util.HashSet;

public class GetvaluefromSET
{

	public static void main(String[] args)
	{
		HashSet<String> set=new HashSet<>();
		set.add("a");
		set.add("b");
				
				System.out.println(set);
				Object[] arr1 = set.toArray();//covering list into array we use setorlist_refvaraible.array() 
				                             //method which returns..Arrays.toString(arr1)
				
				System.out.println(Arrays.toString(arr1));
				for(Object e:arr1)
					System.out.println(e);
		
		
			String[] arr = set.toArray(new String[set.size()]);
		
		
		System.out.println(Arrays.toString(arr));
		
		

	}

}
