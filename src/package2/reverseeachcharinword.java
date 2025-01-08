package package2;

import java.util.Arrays;

public class reverseeachcharinword 
{

	public static void main(String[] args) 
	{
		
		String s="WElcome to Java prg";
		String[] word = s.split("");
		String reversestring="";
		for(String w:word)
		{
			String reverseword="";
			for(int i=w.length()-1;i>=0;i--)
			{
				reverseword=reverseword+w.charAt(i);
				System.out.println(reverseword);
			}
			reversestring=reversestring+reverseword;
			
		}
		System.out.println(reversestring);
		
}
}


