package package2;

import java.util.ArrayList;
import java.util.Collections;

public class Descendingsort {

	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(100);
		a.add(56);
		a.add(1245);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		//Collections.sort(a,Collections.reverseOrder());
		Collections.reverse(a);
		System.out.println(a);

	}

}
