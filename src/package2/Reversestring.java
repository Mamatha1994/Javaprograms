package package2;

public class Reversestring {

	public static void main(String[] args)
	{
		String st="ABCD";
		String rev="";
		
		for(int i=st.length()-1;i>=0;i--)
		{
			rev=rev+st.charAt(i);
			
		}
		System.out.println(rev);
		

	}

}
