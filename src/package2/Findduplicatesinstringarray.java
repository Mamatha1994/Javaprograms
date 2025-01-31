package package2;

public class Findduplicatesinstringarray 
{

	public static void main(String[] args)
	{
		String s[]= {"a","b","c"};
		String s1[]= {"a","d","e"};
		
		int x = s.length;
		System.out.println(x);
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s1.length;j++)
			{
				if(s[i]==s1[j])
				{
					System.out.println(s[j]);
				}
			}
		}
	}

}
		



	


