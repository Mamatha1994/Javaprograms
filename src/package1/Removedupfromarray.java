package package1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Removedupfromarray {

	public static void main(String[] args)
	{
		int arr[]= {1,2,3,3,4,4};
		int m = arr.length;
		System.out.println(m);
		HashSet<Integer> h=new HashSet<Integer>();
		for(int i=0; i<m;i++)
		{
			h.add(arr[i]);
		}
		System.out.println(h);
		
//		
////	}
//		String str[]={"abc","abc","def"};
//		
//		//String a = Arrays.toString(str);
//		//System.out.println(a);
//		HashSet<Character> h=new HashSet<>();
//		for(int i=0;i<a.length();i++)
//		{
//			h.add( a.charAt(i));
//		}
//		System.out.println(h);
//	}	
}
}

