import java.io.*;

public class ReadFromFile 
{
	public static void main(String[] args) throws IOException 
	{
			File obj = new File("D:\\File handling java\\newFile.txt");
			
			BufferedReader br = new BufferedReader(new FileReader(obj));
			
			String str ;
			while((str = br.readLine()) != null)
			{
				System.out.println(str);
			}
			
	}

}
