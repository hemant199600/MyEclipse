package string_Assignment2August;

import java.util.Scanner;

public class Q11_Count_Word_char {

	private int ch;
	public void countWords(String s)
	{
		int word=1;
		String a[]=s.split("");
		for(int i=0;i<a.length;i++)
		{
			if(a[i].equals(" "))
			{
				word++;
			}
			else
			{
				ch++;
			}
		}
		System.out.println("Total number of Words in given string: "+word);
		System.out.println("Total number of char in given string: "+ch);
	}
	public static void main(String[] args) {
		Q11_Count_Word_char obj=new Q11_Count_Word_char();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		obj.countWords(s);

	}

}
