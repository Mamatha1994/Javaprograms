package package2;

public class pintwithoutusingloop {

	public static void main(String[] args) 
	{
		withoutloop(1);

	}
	static void withoutloop(int n)
	{
		if(n<=10)
		{ 
			System.out.println(n);
			withoutloop(n+1);
			
		}
	}

}
