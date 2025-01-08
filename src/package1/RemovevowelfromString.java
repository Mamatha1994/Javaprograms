package package1;

public class RemovevowelfromString {

	public static void main(String[] args) 
	{
		String s="Welcoeiou";
		for(int i=0;i<s.length();i++)
		{
if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
{
		continue;	
}
else {
	
	System.out.println(s.charAt(i));
	}
}
		}
}
		
		


