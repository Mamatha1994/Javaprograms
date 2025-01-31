package package2;

public class Reversenumber {

	public static void main(String[] args) 
	{
		int num=111;
		int backup=num;
		int reverse=0;
		while(num!=0)
	{ 
	int remainder=num%10;
	reverse=reverse*10+remainder;
	num=num/10;
	}
		
		System.out.println(reverse);
		if(backup==reverse)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
	}
	
}
;