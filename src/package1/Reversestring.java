package package1;

public class Reversestring {

	public static void main(String[] args)
	{
		String st="ABCD";
		String rev="";
		int x = st.length();
		for(int i=x-1;i>=0;i--)
		{
			rev=rev+st.charAt(i);
			
		}
		System.out.println(rev);
		

	}

}
