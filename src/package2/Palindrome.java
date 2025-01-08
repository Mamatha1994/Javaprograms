package package2;

public class Palindrome {

	public static void main(String[] args)
	{
		String s1="MOM Is abc";
		String s2="";
		
		//System.out.println("length of array"+lengt);
		for(int i=s1.length()-1;i>=0;i--)///for string lenght()-1 of array length-1
		{
			s2=s2+s1.charAt(i);
		}
		
		System.out.println(s2);
		if(s2.equals(s1))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}
	}
