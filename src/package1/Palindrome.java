package package1;

public class Palindrome {

	public static void main(String[] args)
	{
		String s1="MOM";
		String s2="";
		int lengt=s1.length();
		System.out.println("length of array"+lengt);
		for(int i=lengt-1;i>=0;i--)
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
