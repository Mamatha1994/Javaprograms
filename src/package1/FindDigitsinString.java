package package1;

public class FindDigitsinString {

	public static void main(String[] args)
	{
		String s="MamathaBK12$% *";
		int digit=0;
		int cha=0;
		int sp=0;
		for(int i=0;i<s.length();i++)
		{
		if(Character.isDigit(s.charAt(i)))
		{
			digit++;
			System.out.println(s.charAt(i));
		}
		if(Character.isAlphabetic(s.charAt(i)))
		{
		
		cha++;
		
		}
		if(Character.isWhitespace(i))
		{
	sp++;
		}
		
		}
		System.out.println("Digit"+digit);
		System.out.println("alpa"+cha);
		System.out.println("special"+sp);
}
}
		

	


