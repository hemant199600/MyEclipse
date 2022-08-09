package mixedAssignment9Aug2022;

import java.util.Scanner;

public class Q1_ReverseWordByWord {

	String s;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter string: ");
		{
			s=sc.nextLine();
		}
	}
	public String [] reverse()
	{
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			char a[]=str[i].toCharArray();
			String st="";
			for(int j=a.length-1;j>=0;j--)
			{
				st+=a[j];
			}
			str[i]=st;
		}
		return str;
	}
	public void display(String s[])
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Q1_ReverseWordByWord obj=new Q1_ReverseWordByWord();
		obj.input();
		obj.display(obj.s.split(" "));
		System.out.println("After reversing ");
		obj.display(obj.reverse());
	}

}
