package package2;

public class NonrepeatedcharinString 
{
public static void main(String[] args)
	{
		String s="mamatha";
		char ch[]=s.toCharArray();
		
		
		for(Character i:ch)
		{
			if(s.indexOf(i)==s.lastIndexOf(i))
			{
				System.out.println(i);
			}
		}
		

	}

}
