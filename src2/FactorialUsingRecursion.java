import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorialUsingRecursion 
{
	int number;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		FactorialUsingRecursion fr = new FactorialUsingRecursion();
		System.out.println("Enter a number to find the factorial : ");
		try
		{
		fr.number = sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("invalid input");
		}
		int fact = fr.factorial(fr.number);
		System.out.println(fact);
	}
		int factorial(int i)
	{
		if(i==0 || i==1)
			return i;
		else
			return i*factorial(i-1);
	}
}