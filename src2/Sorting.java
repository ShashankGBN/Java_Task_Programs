import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) 
	{
		String names[] = {"bharath","vishnu","akhil", "nikhil","kishore"};
		System.out.println("before sorting : ");
		for(int i=0; i<names.length; i++)
		{
		System.out.println(names[i]);
		}
		Arrays.sort(names);
		System.out.println("After sorting : ");
		for(String s : names)
		{
			System.out.println(s);
		}
	}

}
