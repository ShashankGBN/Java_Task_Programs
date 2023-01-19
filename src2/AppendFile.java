import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendFile {

	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		FileWriter enter = new FileWriter("D:\\File handling java\\newFile.txt", true);
		System.out.println("Enter into the file : ");
		enter.write(sc.nextLine());
		System.out.println("successfully entered into file");
		enter.close();
	}

}
