import java.util.Scanner;
public class Multiplication 
{
		public static void main(String [] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter two numbers");
			try
			{
			int number1 = sc.nextInt();
			int number2 = sc.nextInt();
			int product = number1*number2;
			System.out.println("product = "+product);
			}
			catch(Exception e)
			{
				System.out.println("invalid input");
			}
		}
	  
}
