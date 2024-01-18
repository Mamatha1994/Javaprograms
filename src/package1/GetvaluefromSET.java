package package1;

import java.util.Arrays;
import java.util.HashSet;

public class GetvaluefromSET
{

	public static void main(String[] args)
	{
		HashSet<String> set=new HashSet<>();
		set.add("a");
		set.add("b");
				int x = set.size();
		
		
			String[] arr = set.toArray(new String[set.size()]);
		
		
		System.out.println(Arrays.toString(arr));
		
		

	}

}
