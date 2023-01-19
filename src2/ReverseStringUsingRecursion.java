
public class ReverseStringUsingRecursion 
{
	public static void main(String[] args) 
	{
		String s = "abcde";
		String s1 = reverse(s);
		System.out.println(s1);
	}
	static String reverse(String str)
	{
		if(str.isEmpty())
			return str;
		else
			return reverse(str.substring(1))+str.charAt(0);
	}
}
