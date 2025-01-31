package package2;

public class countupperandlowercase {

	public static void main(String[] args) 
	{
		String s1="Welcome to JAVA TutorialS123";
		char ch1[]=s1.toCharArray();
		
		int upper=0;
		int lower=0;
		
		for(int i=0;i<s1.length();i++)
		{
			if(ch1[i]>'A' && ch1[i]<'Z')
			{
				upper++;
				System.out.println(ch1[i]);
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
