package package2;

public class starprogram3 {

	public static void main(String[] args)
	{
	int row=4;
		for (int i = 1; i <= row; i++) 
		{
            // Inner loop to print spaces
            for (int j = 1; j <=row-i; j++)
            {
                System.out.print(" ");
            }
            // Inner loop to print stars
            for (int k = 1; k <= i; k++)
            {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}


//           *
//          **
//         ***
//        ****
