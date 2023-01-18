import java.util.InputMismatchException;
import java.util.Scanner;
public class Grade 
{
	static int average;
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the average marks of a student");
		try
		{
		 average = s.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid Input");
		}
			if(average >= 80)
			System.out.println("Grade = A");
			else if(average < 80 && average >= 60)
			System.out.println("Grade = B");
			else if(average < 60 && average >= 40)
			System.out.println("Grade = C");
			else if(average > 0)
				System.out.println("Grade = D");
	}

}




