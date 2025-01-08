package package1;

import java.util.Arrays;

public class Splitstring {

	public static void main(String[] args)
	{
		String s1="Welcome@to*java,?training";
	String u=s1.toUpperCase();
		String str[]=u.split("[@*,?]");
		//System.out.println(Arrays.toString(str));
		
		
		 //for(String s:str) { System.out.println(s); }
		 
	for(int i=0;i<str.length-1;i++)
	{
		String sub1 = str[i];
			System.out.println(sub1);
		}

	}

}
