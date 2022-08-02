package strings;
import java.util.Scanner;

public class Total_Number_Char {

	public void calc(String s)
	{
		char ch[]=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				count++;
			}
		}
		System.out.println("Total number of character in string :"+count);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String s=sc.nextLine();
		Total_Number_Char tn=new Total_Number_Char();
		tn.calc(s);
	}

}
