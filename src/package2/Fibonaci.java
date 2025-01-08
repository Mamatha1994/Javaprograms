package package2;

public class Fibonaci{  
	public static void main(String[] args)
	{ 
		int first=0;int second=1;
		for(int i=0;i<=5;i++)
		{
			System.out.println(first);
			int third=second+first;
			first=second;
		    second=third;
		}

	   
	}
}