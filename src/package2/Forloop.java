package package2;

public class Forloop {

	public static void main(String[] args)
	{
		String s ="Mamathas";
		String s1="abcdefgh987";
		for(int i=s.length()/2;i<s.length()-1;i++)//print half of the string
		{
			System.out.print(s.charAt(i));
			System.out.print(s1.charAt(i));
		}
		for(int i=s.length()-1;i<=s1.length()-1;i++)
		{
			System.out.print(s1.charAt(i));
		}
		

	}

}
