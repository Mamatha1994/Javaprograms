package package1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class Removecharatersfromstring {

	public static void main(String[] args)
	{
		String s = "java 12 test 321";
		s=s.replaceAll("[1-9]", "");
		System.out.println(s);
		String m = "java 123 test 321";
		m=m.replaceAll("[a-z]", "");
		System.out.println(m);
		
		String s1 = "java 12 Test  $% 32671";
		s1=s1.replaceAll("[A-Za-z$%]", "");
		System.out.println(s1);


				
	}
	

}
