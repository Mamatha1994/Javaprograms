package package1;

public class Blockstaticnonstatic
{ 
	static int x=18970;

	public static void main(String[] args)
	{
		System.out.println(x);;
		add.method2();
		add q=new add();//creating object as the method is nonstatic
		q.method1(1234567);
	}

}
 class add//default class i,e class is accessible only  with in that package 
{
	 private int a=10;//encapsulation to access u shld used getters to get value and setters to set value
	 int b;//global variable dey  have default values
	 int c=2;
	 void method1(int z)//non static method
	 
	{   a=z;
		 int d=4;//local variable must be intialized as they don't have default values
		System.out.println("This non static method");
		System.out.println(d);
		System.out.println(a);
		System.out.println(b);
	}
	 static void method2()//static method
	 {
		 System.out.println("static method is called");
		 
	 }
	
}


