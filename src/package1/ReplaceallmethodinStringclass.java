package package1;

public class ReplaceallmethodinStringclass {

	public static void main(String[] args)
	{
	String s1="Wel 12come@$ 0";
	s1=s1.replaceAll("[^a-zA-Z]","");
	System.out.println(s1);
	}

}
