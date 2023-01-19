import java.util.Scanner;

public class StringToChar {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string value :");
		String s = sc.next();
		
		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			System.out.println(c);
		}
	}

}
