package package1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Removeduplicatesfromarraystring {

	public static void main(String[] args)
	{
		String s1[]= {"abc", "def","def","xyz", "xyz"};
		Set<String> s2=new HashSet<String>();
		Collections.addAll(s2, s1);
		System.out.println(s2);

	}

}
