package package1;

public class Printprimenum
{

	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		//int l = arr.length;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("even"+arr[i]);
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println("odd"+arr[i]);
			}
			
		}
		

	}

}


