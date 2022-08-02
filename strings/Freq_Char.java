package strings;
import java.util.Scanner;

public class Freq_Char {

	public void freq(String s)
	{
		int lock=-1;
		int count=0;
		char[] ch=s.toCharArray();
		int c[]=new int[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					c[j]=lock;
				}
			}
			if(c[i]!=lock)
			{
				c[i]=count;
			}
		}
		System.out.println("Frequency of character in Given String:");
		System.out.println("Character\tFrequency");
		for(int i=0;i<ch.length;i++)
		{
			if(c[i]!=lock)
			{
				System.out.println("\t"+ch[i]+"\t"+c[i]);
			}
		}
	}
	public void display( char[] ch)
	{
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=sc.nextLine();
		Freq_Char fq=new Freq_Char();
		fq.display(str.toCharArray());
		fq.freq(str);
	}

}
