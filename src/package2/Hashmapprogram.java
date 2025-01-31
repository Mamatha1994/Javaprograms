package package2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmapprogram {//program to find largest number

	public static void main(String[] args)
	//to find largest  value in map
	{
		
	        // Create a map with some key-value pairs
	        Map<String, Integer> map = new HashMap<>();
	        map.put("A", 10);
	        map.put("2", 50);
	        map.put("3", 30);
	        map.put("4", 70);
	        map.put("5", 20);

	        // Initialize variables to find the largest value
	        int leastValue = Integer.MIN_VALUE;//it is contant in Integer calss which can hold least value 
	        for(Integer x:map.values())
	        {
	        	if(x>leastValue) 
	        	{
	        		
	        		leastValue=x;
	        	}
	        }
	        System.out.println(leastValue);
	        
	       

	     
	}
}