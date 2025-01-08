package package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Countfrequecyofrepeatedcharinstring {

	public static void main(String[] args)
{
//		String[] s1= {"abc", "bcd","abc"};//list forloop map forloop nd foreach loop
//	String s=Arrays.toString(s1);
//		System.out.println(s);
//String s2="a bb cc";
//String s3=s2.replaceAll("bb", "");
//s2.replace(["^bb"], "");//this will not work
//sSystem.out.println(s3);
	String s="mamatha";
		ArrayList<Character> a=new ArrayList();
		for(int i=0;i<s.length();i++) 
		{
			a.add(s.charAt(i));
		}
		Map<Character,Integer> m=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			m.putIfAbsent(a.get(i), Collections.frequency(a, a.get(i)));
		}
		
		for(Map.Entry<Character, Integer> e: m.entrySet())
		{
			System.out.println("key is " + "_" +e.getKey() + "value is " +  e.getValue() );
		}
	}

}
