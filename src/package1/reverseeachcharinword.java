package package1;

public class reverseeachcharinword {

	public static void main(String[] args) 
	{
		
		String s="WElcome to Java prg";
		//String word[]=s.split("\\s");
		char[] word = s.toCharArray();
		String reverseword="";
		for(Character w:word)
		{
			StringBuilder b=new StringBuilder(w);
			
			b.reverse();
			System.out.println(b);
			reverseword+=b.toString()+" ";
		}
		System.out.println(reverseword);
	}
	
	
		  
		 
	

}
