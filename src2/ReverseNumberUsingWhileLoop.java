import java.util.Scanner;

public class ReverseNumberUsingWhileLoop 
{
	public static void main(String[] args) 
	{
				int reversedNumber = 0;
				Scanner s = new Scanner(System.in);
				System.out.print("Enter a number :  ");
				try
				{
				int number = s.nextInt();
				while(number > 0)
				{
					reversedNumber += number%10;
					number/=10;
					if(number==0)
						break;
					reversedNumber*=10;
				}
				System.out.println(reversedNumber);
				}
				catch(Exception e)
				{
					System.out.println("Enter valid input...!");
				}
	}
}
