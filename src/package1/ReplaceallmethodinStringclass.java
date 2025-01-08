package package1;

public class ReplaceallmethodinStringclass {

	public static void main(String[] args)
	{
	String s="Mamatha@#45 %4";
	{
		s=s.replaceAll("[a-zA-z]", "");
		System.out.println(s);
		String s1="Mamatha@#45 %4";
		s1=s1.replaceAll("[^a-zA-z]", "");
		System.out.println(s1);
		
		


}
}
}