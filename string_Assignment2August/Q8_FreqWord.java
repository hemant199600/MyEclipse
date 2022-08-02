package string_Assignment2August;

import java.util.Scanner;

public class Q8_FreqWord {

	public void freq(String s)
	{
		int lock=-1;
		int count=0;
		String[] ch=s.split(" ");
		int c[]=new int[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i].equals(ch[j]))
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
	public void display( String[] ch)
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
		Q8_FreqWord fq=new Q8_FreqWord();
		fq.display(str.split(" "));
		fq.freq(str);
	}

}
