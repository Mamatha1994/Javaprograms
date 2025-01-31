package package2;

import java.util.HashMap;
import java.util.Map;

public class Removeduplicatesinstringusinghashmap {

	public static void main(String[] args) 
	{
		String s="mamatha";
		Map<Character,Integer> m=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			if(m.containsKey(s.charAt(i)))
			{
				m.remove(s.charAt(i));
				
			}
			else 
			{
			
				m.put(s.charAt(i), 1);	
				
			}
			
		}
		System.out.println(m);
	}

}
