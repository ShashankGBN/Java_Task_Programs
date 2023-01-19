import java.util.Scanner;

public class ArthematicOperations
{	
	static int number1;
	static int number2;
	public void arthematicOperation()
	{
		int sum = number1 + number2;
		System.out.println("Sum of given values is : "+sum);
	}
	public void arthematicOperation(int number1)
	{
		this.number1=number1;
		int sub = number1-number2;
		System.out.println("Total value after substraction is : "+sub);
	}
	public void arthematicOperation(int number1, int number2)
	{
		this.number1=number1;
		this.number2=number2;
		int product = number1*number2;
		System.out.println("Product is : "+product);
	}
	public void arthematicOperation(double quotient)
	{
		int reminder = number1%number2;
		quotient = number1/number2;
		System.out.println("Reminder of given numbers :"+reminder);
		System.out.println("Quotient of given numbers :"+quotient);   
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers to perform arthematic operations : ");
		
		try
		{
		number1=s.nextInt();
		number2=s.nextInt();
		}
	    catch(ArithmeticException e)
		{
	    	System.out.println("Enter valid input...!");
		}
		 ArthematicOperations ao = new ArthematicOperations();
		 
		 System.out.println("Select your choice to perform a arthematic operation 1-Addition, 2-Substraction, 3-Multiplication, 4-Division");
		 int choice = s.nextInt();
		 switch (choice)
		 {
		 	case 1 : 
		 	{	
		 		ao.arthematicOperation();
		 	}break;
		 	case 2 :
		 	{
		 		ao.arthematicOperation(number1);
		 	}break;
		 	case 3 :
		 	{
		 		ao.arthematicOperation(number1, number2);
		 	}break;
		 	case 4 : 
		 	{
		 		ao.arthematicOperation(0.0);
		 	}break;
		 	default :
		 	System.out.println("Invalid iinput");
		 }
	}

}
