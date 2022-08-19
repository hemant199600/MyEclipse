package mixedAssignment9Aug2022;

import java.util.Scanner;

public class Q14_Occurence_FirstWC_LastWC {
	
	String s;
	int count;
	Scanner sc=new Scanner(System.in);
	Q14_Occurence_FirstWC_LastWC()
	{
		System.out.println("Enter string: ");
		{
			s=sc.nextLine();
		}
	}
	public int firstWord()
	{
		count=1;
		String str[]=s.split(" ");
		String word=str[0];
		for(int i=0;i<str.length;i++)
		{
			if(str[i]==word)
			{
				count++;
			}
		}
		return count;
	}
	public int lastWord()
	{
		count=1;
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			if(str[str.length-1]==str[i])
			{
				count++;
			}
		}
		return count;
	}
	public int firstChar()
	{
		count=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==ch[0])
			{
				count++;
			}
		}
		return count;
	}
	public int lastChar()
	{
		count=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==ch[ch.length-1])
			{
				count++;
			}
		}
		return count;
	}
	public void display()
	{
		System.out.println("Entered String             : "+s);
		System.out.println("First Word is repeated     : "+firstWord());
		System.out.println("Last  Word is repeated     : "+lastWord());
		System.out.println("First Char is repeated     : "+firstChar());
		System.out.println("Last  Char is repeated     : "+lastChar());
	}
	public static void main(String[] args) {
		Q14_Occurence_FirstWC_LastWC obj=new Q14_Occurence_FirstWC_LastWC();
		obj.display();

	}

}
