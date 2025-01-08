package package2;

public class CombineString {

	public static void main(String[] args)
	{
		String S1="Heloo";
		String S2="Hi";
		String S3="bye";
		String S4=S1.concat(S2);
		String S5=S4.concat(S3);
		System.out.println(S5);
		
		String S6=S1.concat(S2).concat(S3);
		System.out.println(S6);

	}

}
