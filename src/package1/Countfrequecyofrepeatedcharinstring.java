package package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Countfrequecyofrepeatedcharinstring {

	public static void main(String[] args)
	{
		String s="Wweellccoommee";
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
			System.out.println("key is "+e.getKey()+ "value is" + e.getValue() );
		}
	}

}
