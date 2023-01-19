import java.util.Scanner;

public class DuplicateCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any word : ");
		String str = sc.nextLine();
		char []ch = str.toCharArray();
		int freq [] = new int[ch.length];
 		for(int i=0; i<ch.length; i++)
		{
			freq[i]=1;
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i]==ch[j] && ch[j]!='0' && ch[j]!=' ')
				{
					freq[i]++;
					ch[j]='0';
				}
			}
		}
 		
 		for(int i=0; i<freq.length; i++)
 		{
 			if(ch[i]!=' ' && ch[i]!='0' && freq[i]>1)
 				System.out.println(ch[i]+" is repeated "+freq[i]+" times.");
 		}
	}

}
