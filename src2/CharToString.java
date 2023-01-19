
public class CharToString 
{
	public static void main(String[] args)
	{
	    char c [] = {'R','u','n','n','i','n','g'};
		String s = "";
		for(int i=0; i<c.length; i++)
		{
			s+=c[i];
		}
		System.out.println("String form of the character array is : "+s);
	}
}

