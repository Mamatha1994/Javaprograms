package package2;

import java.util.ArrayList;
import java.util.Collections;

public class Sortarraylist {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(56);
		a.add(100);
		a.add(31);
		a.add(1);
		System.out.println("before sorting"+ a);
		Collections.sort(a);
		System.out.println("After sorting"+a);
		Collections.reverse(a);
		System.out.println(a);

	}

}
