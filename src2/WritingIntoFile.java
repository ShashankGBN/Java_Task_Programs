import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingIntoFile {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path");
		String path = sc.nextLine();
		try
		{
			FileWriter enter = new FileWriter(path);
			System.out.println("Enter something that need to be stored into file...?");
			enter.write(sc.nextLine());
			enter.close();
			System.out.println("Written successfully into file...");
		}
		catch(IOException e)
		{
			System.out.println("Some exception has occured... or the file is in read only mode.");
		}
	}

}
