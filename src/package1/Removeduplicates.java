package package1;

import java.util.HashSet;
import java.util.Set;

public class Removeduplicates {

	public static void main(String[] args) 
	{
	 String s1="mamatha";

	 Set<Character> set1=new HashSet<Character>();
	
	 int x=s1.length();
	 System.out.println(x);
	 for(int i=0;i<x;i++)
	 {
		 set1.add(s1.charAt(i));
	 }
	 System.out.println(set1);
	}
}
