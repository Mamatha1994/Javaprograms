package package1;

import java.util.HashSet;

public class Removedupfromarray {

	public static void main(String[] args)
	{
		int arr[]= {1,2,3,3,4,4};
		int m = arr.length;
		System.out.println(m);
		HashSet<Integer> h=new HashSet<Integer>();
		for(int i=0; i<=m-1;i++)
		{
			h.add(arr[i]);
		}
		System.out.println(h);
		
		
	}

	
}
