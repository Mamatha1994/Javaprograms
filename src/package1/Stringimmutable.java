package package1;

public class Stringimmutable {

	public static void main(String[] args) 
	{
		String s1="Apple";
		String s2="Apple";
				String s3= new String("Apple");
				boolean s4 = s1==s2;
				boolean s5 = s1==s3;
				System.out.println(s4);
				System.out.println(s5);
	}

}
