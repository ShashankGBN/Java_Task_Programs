import java.util.Scanner;

public class UserInput 
{
	static int i;
	static char ch;
	static String str;
	public static void main(String[] args)
	{	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter integer value");
		try
		{
		 i = s.nextInt();  // to get integer input
		}
		catch(Exception e)
		{
			System.out.println("invalid input");
		}
		
		System.out.println("Enter a character");
		 ch = s.next().charAt(0);  // to get character input
		System.out.println("Enter a string");
		 str = s.next();   // to get string input
		 
		 System.out.println(i+","+ch+","+str);
	}

}