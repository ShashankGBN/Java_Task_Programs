import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) 
	{
		String path = "D:\\File handling java\\newFile.txt";
		try
		{
		File obj = new File(path);
			if(obj.createNewFile())
			{
				System.out.println("new file created... "+obj.getName());
			}
			else
				System.out.println("file already exists...");
		}
		catch(IOException e)
		{
			System.out.println("Some problem has occured");
		}
	}

}
