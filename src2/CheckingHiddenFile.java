import java.io.File;

public class CheckingHiddenFile 
{
	public static void main(String[] args) 
	{
		File file = new File("D:\\File handling java\\newFile.txt");
		boolean flag = file.isHidden();
		
		if(flag == true)
			System.out.println("The file is hidden");
		else
			System.out.println("the file is not hidden");
	}

}
