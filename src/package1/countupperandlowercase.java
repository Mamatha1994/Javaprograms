package package1;

public class countupperandlowercase {

	public static void main(String[] args) 
	{
		String s1="Welcome to JAVA TutorialS123";
		int upper=0;
		int lower=0;
		int x=s1.length();
		for(int i=0;i<x;i++)
		{
			char ch = s1.charAt(i);
			if(ch>65 && ch<90)
			{
				upper++;
			}
			else 
			{
				lower++;
			}
		}
		System.out.println(lower);
		System.out.println(upper);
	}

}
