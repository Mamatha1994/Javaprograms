package package2;

public class Class1 //Constructor example
{ 
	
	static void method1()
	{
		System.out.println("hi");
	}
	  int x;
	static int y;
	int z;
	
	Class1(int a, int b, int c)
	{
		x=a;
		y=b;
		z=c;
		
	}
	
	Class1()
	{
		System.out.println("hi");
	}
	public static void main(String args[])
	{ 
		Class1 c=new Class1(1,2,3);
		new Class1();
		System.out.println(c.x);//non static to static
	}
}


