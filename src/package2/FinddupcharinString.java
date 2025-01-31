package package2;

import java.util.Arrays;

public class FinddupcharinString 
{

	public static void main(String[] args)
	
	{
		String s[]={"aabbcdefg","aabbcdefg","adge"};
//		String s1 = Arrays.toString(s);
//		 int x = s1.length();
//		 //System.out.println(s1);
//			for(int i=1;i<s1.length();i++)
//			{
//				System.out.println(s1.charAt(i));
//			}
//		 
		//char ch[] = s.toCharArray();
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i]==s[j])
				{
					System.out.println(s[j]);
					count++;
					
				}
			}
			
		}
		System.out.println(count);
		

	}

}
