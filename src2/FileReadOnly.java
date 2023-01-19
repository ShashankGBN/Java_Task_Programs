import java.io.File;

public class FileReadOnly {

	public static void main(String[] args) 
	{
		File file = new File("D:\\File handling java\\newFile.txt");
		file.setReadOnly();
		
			System.out.println("file can only be read");
	}

}
