package mixedAssignment9Aug2022;

import java.util.Scanner;

public class Q2_CountWord_Character {

	String s;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter string: ");
		{
			s=sc.nextLine();
		}
	}
	public int countWord()
	{
		String str[]=s.split(" ");
		int word=0;
		for(int i=0;i<str.length;i++)
		{
			
			word++;
		}
		return word;
	}
	public int countChar()
	{
		char a[]=s.toCharArray();
		int ch=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=' ')
			{
				ch++;
			}
		}
		return ch;
	}
	
	public static void main(String[] args) {
		
		Q2_CountWord_Character obj=new Q2_CountWord_Character();
		obj.input();
		System.out.println("Enterd String     : "+obj.s);
		System.out.println("Count of word     : "+obj.countWord());
		System.out.println("count of character: "+obj.countChar());
		
	}

}
