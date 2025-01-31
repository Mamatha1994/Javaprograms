package package2;

public class Removelast4characterfromstring {

	public static void main(String[] args)
	{
		String s="ABCDEFGHIJ";
		        //0123456789
		
		for(int i=s.length()-4;i<=s.length()-1;i++)
		{ //6;6<9
			System.out.print(s.charAt(i));
		}

	}

}
