import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a year :");
			try
			{
			int year = sc.nextInt();
				if(year%4==0)
				System.out.println("given year is a leapyear");
				else
				System.out.println("given year is not a leapyear");
			}
			catch(InputMismatchException e)
			{
				System.out.println("invalid input");
			} 
			
			
	  	}
}
