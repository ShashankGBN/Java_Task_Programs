import java.util.Scanner;
public class MultiplicationTables {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number whose multiplication table is required : ");
		try
		{
		int number = sc.nextInt();
		System.out.println("Enter the count of iterations : ");
		int iteration = sc.nextInt();
		
		for(int i=1; i<=iteration; i++)
		{
			System.out.println(number+" * "+i+" = "+number*i);
		}
		}
		catch(Exception e)
		{
			System.out.println("invalid exception");
		}
	}

}
