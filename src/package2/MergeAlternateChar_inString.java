package package2;

import java.util.StringTokenizer;

public class MergeAlternateChar_inString 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1="Mamatha";
		String s2="Parvathi123";
		int count = s1.length();
		System.out.println(count);
		
		
		
		for(int i=0;i<s1.length()-1;i++) {
			System.out.print(s1.charAt(i));
			System.out.print(s2.charAt(i));
		
		
		}//6<=9 yes
		for(int j=s1.length()-1;j<=s2.length()-1;j++) {
			System.out.print(s2.charAt(j));
		}
//		for(int j=s2.length()-1;j>=s2.length()-3;j--) {
//	System.out.print(s2.charAt(j));
//}
	
		
//7
		//MKaemeartthhi123
		//MKaemeartthhai123
		//MKaemeartthhaii123
	}

}
