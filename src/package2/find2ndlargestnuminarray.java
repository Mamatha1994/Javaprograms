package package2;

import java.util.Arrays;

public class find2ndlargestnuminarray {

	public static void main(String[] args)
	
	{
	int arr[]= {1,8,9,6};
	
	int largest=arr[0];
	int smallest=arr[0];
	
	for (int i=0;i<arr.length;i++)
	{
		if(arr[i]>largest)
		{
			largest=arr[i];
			
		}
		else if (arr[i]<smallest)
		{
			smallest=arr[i];
		}
	}
	
	System.out.println(Arrays.toString(arr));
	System.out.println(largest);
	System.out.println(smallest);

	}
	

}
