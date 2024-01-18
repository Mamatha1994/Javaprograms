package package1;

public class FinddupcharinString 
{

	public static void main(String[] args)
	
	{
		String s="wweellccoomm";
		char ch[] = s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[j]);
					count++;
				}
			}
			
		}
		System.out.println(count);

	}

}
