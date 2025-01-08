package package1;

public class countupperandlowercase {

	public static void main(String[] args) 
	{
		String s1="Welcome to JAVA TutorialS123";
		//s1.toCharArray();
		
		int upper=0;
		int lower=0;
		
		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			if(ch>'A' && ch<'Z')
			{
				upper++;
				System.out.println(s1.charAt(i));
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
