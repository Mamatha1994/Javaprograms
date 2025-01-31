package package2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Listclass ///retrive duplicats in two lists...after java 8 stream function is introduced
{

	public static void main(String[] args)
	{
		List<String> l=new ArrayList<String>();
		l.add("a");
		l.add("b");
		l.add("a");
		//System.out.println(l);
		List<String> l2=new ArrayList<String>();
		l2.add("a");
		l2.add("c");
		//System.out.println(l2);
		Set<String> s=new HashSet<>(l);//removing duplicates
		//System.out.println(s);
		List<String> list = l.stream().filter(element->l2.contains(element)).toList();//to find common elements ->duplicates
		System.out.println(list);
//		for(int i=0;i<l.size();i++)
//		{
//			System.out.println(l.get(i));
//		}
		
	}

}

