package mixedAssignment9Aug2022;

import java.util.Scanner;

public class Q8_MostRepeatedChar {

	String s;
	int count[];
	char[]ch;
	int lock=-1,c;
	
	Scanner sc=new Scanner(System.in);
	public Q8_MostRepeatedChar() {
		System.out.println("Enter first String: ");
		s=sc.nextLine();
	}
	
	public void freq()
	{
		ch=s.toCharArray();
		count=new int[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			c=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					c++;
					count[j]=lock;
				}
			}
			if(count[i]!=lock)
			{
				count[i]=c;
			}
		}
	}
	public void repeat()
	{
		int max=count[0];
		for(int i=0;i<count.length;i++)
		{
			if(count[i]>max)
			{
				max=count[i];
			}
		}
		for(int i=0;i<count.length;i++)
		{
			if(max==count[i])
			{
				System.out.println("Most Repeated character :"+ch[i]);
				break;
			}
		}
	}
	public static void main(String[] args) {
		Q8_MostRepeatedChar obj=new Q8_MostRepeatedChar();
		obj.freq();
		obj.repeat();

	}

}
