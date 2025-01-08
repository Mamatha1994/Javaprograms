package package1;

import java.util.Arrays;

public class Sortcharinstring 
{
	public static void main(String[] args) 
	{ 
		String s1="Mamatha";
		System.out.println(s1);
		s1=s1.toLowerCase();
		char cha[] = s1.toCharArray();
		char temp;
		for(int i=0;i<cha.length;i++)
		{
			for(int j=i+1;j<cha.length;j++)
			{
				if(cha[i]>cha[j])
				{ temp=cha[i];
				cha[i]=cha[j];
				cha[j]=temp;
					
				}
			}
		}
		//System.out.println(new String(cha));
		System.out.println(Arrays.toString(cha));
	
		
	}
}
