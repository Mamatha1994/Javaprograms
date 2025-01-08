package package2;

public class Thissuperconstructer 
{ static int age;
  static String name;
  Thissuperconstructer(int x)//this constructer needs to called in another constructer
  {
	  this.age=x;
	  
  }
  Thissuperconstructer(String s1,int x)
  
  {  
       this(x);
  
	  this.name=s1;
	 
}
  
  
public static void main(String[] args)
	{
	Thissuperconstructer b=new Thissuperconstructer("Mamatha",29);
	System.out.println(name);
	System.out.println(age);

	}
}

