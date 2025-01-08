package package2;

import java.util.ArrayList;

public class Creatingafunctionassarrylistasaruguments {

	
	public static void main(String[] args)
	{
		
		ArrayList <String>a=new ArrayList<>();
		ArrayList <String> b=new ArrayList<>();
		
		compare(a,b);
		System.out.println(a);
		System.out.println(b);
		
	}
 static void compare(ArrayList<String> s1,ArrayList<String> s2)
 {
	s1.add("a");
	s1.add("b");
	//System.out.println();
	s2.add("a");
	s2.add("ba");
	if(s1.equals(s2))
	{
		System.out.println("equal");
	}
	else
	{
		System.out.println("notequal");
	}
	
}
 
}
