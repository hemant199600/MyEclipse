package string_Assignment2August;

import java.util.Scanner;

public class Q12_CheckVowelWord {

	public void print(String s)
	{
		char[] a;
		
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			int c=0;
			a=s1[i].toCharArray();
			for(int j=0;j<a.length;j++)
			{
				if(this.checkChar(a[0]))
				{
					c++;
				}
			}
			if(c>0)
			{
				System.out.println(s1[i]+" ");
			}
		}
	}
	public boolean checkChar(char s)
	{
		if(s=='A'||s=='a'||s=='E'||s=='e'||s=='I'||s=='i'||s=='O'||s=='o'||s=='U'||s=='u')
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Q12_CheckVowelWord obj=new Q12_CheckVowelWord();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		obj.print(s);

	}

}
