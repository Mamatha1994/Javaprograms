package package2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Removeduplicatesfromarraystring {

	public static void main(String[] args)
	{
		String s1[]= {"abc", "def","def","xyz", "xyz"};
		//String s2[]= {"abc", "def","def", "xyz"};	
		Set<String> s=new HashSet<String>();
		Collections.addAll(s, s1);
		System.out.println(s);
		
		
		

	}

}
