package package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraytolist {

	public static void main (String args[]) {

	      // create an array of strings
	      String a[] = {"abc","klm","xyz","pqr"};
	     

	      List<String> list = Arrays.asList(a);

	      // printing the list
	      System.out.println("The list iss:" + list);
	   }
	}
