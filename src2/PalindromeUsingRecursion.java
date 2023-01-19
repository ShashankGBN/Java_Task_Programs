import java.util.Scanner;

public class PalindromeUsingRecursion {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word : ");
		String str = sc.nextLine();
		PalindromeUsingRecursion pr = new PalindromeUsingRecursion();
		String reversedString = pr.reverse(str);
		System.out.println(reversedString);
		if(str.equalsIgnoreCase(reversedString))
			System.out.println("The given word is a Palindrome.");
		else 
			System.out.println("The given word is not a Palindrome.");
		
	}
	
	public String reverse(String s)
	{
		if(s.isEmpty())
			return s;
		else
			return reverse(s.substring(1))+s.charAt(0);
	}
}
