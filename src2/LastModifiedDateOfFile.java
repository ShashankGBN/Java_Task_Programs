import java.io.File;
import java.sql.Date;
import java.sql.Time;

public class LastModifiedDateOfFile
{
	public static void main(String[] args) 
	{
		String path = "D:\\File handling java\\newFile.txt";
		File file = new File(path);
		
		long modified = file.lastModified();
		Date date = new Date(modified);
		Time time = new Time(modified);
		System.out.println("last modified date of given file is : ");
		System.out.println(date);
		System.out.println("last modified time is : ");
		System.out.println(time);
	}
}
