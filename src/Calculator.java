import java.util.Scanner;

public class Calculator 
{	
	static int num1;
	static int num2;
	public static void main(String[] args) 
	{
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter two numbers");
		try
		{
		 num1 = s.nextInt();
		 num2 = s.nextInt();
		 System.out.println("Enter the operator : ");
			System.out.println("Addition : +");
			System.out.println("Substraction : -");
			System.out.println("Multiplication : *");
			System.out.println("Division : /");
			char operator = s.next().charAt(0);
			switch (operator)
			{
				case '+' :
				{
					int add = num1+num2;
					System.out.println("Sum = "+add);
				}break;
				
				case '-' :
				{
					int sub = num1 - num2;
					System.out.println("Substraction = "+sub);
				}break;
				
				case '*' : 
				{
					int prod = num1*num2;
					System.out.println("Product = "+prod);
				}break;
				
				case '/' :
				{
					int div = num1/num2;
					System.out.println("quotient = "+div);
				}break;
				
				default :
				{
					System.out.println("Invalid Input");
				}
			}
		}
		catch (Exception e)
		{
			System.out.println("Enter numeric value");
		}
	}

}
