package package1;

import java.util.HashMap;
import java.util.Map;

public class removedupusinghashmap {

	public static void main(String[] args)
	{
		int arr[]= {1,1,2,5,5,6};
		Map<Integer,Integer> m=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(m.containsKey(arr[i]))
			{
				m.remove(arr[i]);
			}
			else	m.put(arr[i], 1);
		}
		
		System.out.println(m);
		

	}

}
