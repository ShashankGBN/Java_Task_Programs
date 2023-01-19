import java.util.Scanner;

public class ReverseNumUsingForLoop 
{
	public static void main(String[] args) 
	{
		int reversedNumber = 0;
		int number = 987654321;
		for(int i=0; i<number; i++)
		{
			reversedNumber += number%10;
			number /= 10;
			if(number == 0)
				break;
			reversedNumber *= 10;
		}
		System.out.println(reversedNumber);
	}
}
