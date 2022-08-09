import java.util.Scanner;

import string_Assignment2August.Q3_Occurence_Word;
import string_Assignment2August.Q4_Occurence_Last_Word;
import string_Assignment2August.Q5_Occurence_char;

public class Q19_OccurenceFwFcLwLc {

	String s;
	int fword,lword,fchar,lchar;
	Q19_OccurenceFwFcLwLc(String s)
	{
		this.s=s;
		
	}
	public void firstWord()
	{
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			if(s1[0].equals(s1[i]))
			{
				fword++;
			}
		}
		
	}
	public void firstChar()
	{
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[0]==ch[i])
			{
				fchar++;
			}
		}
	}
	public void lastWord()
	{
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			if(s1[s1.length-1].equals(s1[i]))
			{
				lword++;
			}
		}
	}
	public void lastChar()
	{
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[ch.length-1]==ch[i])
			{
				lchar++;
			}
		}
	}
	public void display()
	{
		System.out.println("Given String :"+s);
		System.out.println("Occurence of first word     : "+fword);
		System.out.println("Occurence of last  word     : "+lword);
		System.out.println("Occurence of first char     : "+fchar);
		System.out.println("Occurence of last  char     : "+lchar);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string.");
		String s=sc.nextLine();
		Q19_OccurenceFwFcLwLc obj=new Q19_OccurenceFwFcLwLc(s);
		obj.firstChar();
		obj.firstWord();
		obj.lastChar();
		obj.lastWord();
		obj.display();

	}

}
