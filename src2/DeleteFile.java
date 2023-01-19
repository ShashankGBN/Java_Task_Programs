import java.io.File;

public class DeleteFile {

	public static void main(String[] args) 
	{
			File obj = new File("D:\\\\File handling java\\\\newFile.txt");
			if(obj.delete())
				System.out.println("The deleted file is : "+obj.getName());
			else
				System.out.println("failed to delete a file.");
	}

}
