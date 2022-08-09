package mixedAssignment9Aug2022;

import java.util.Scanner;

public class Q3_StartsWithVowel {

	String s;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter string: ");
		{
			s=sc.nextLine();
		}
	}
	public void check()
	{
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			if((str[i].startsWith("a")||str[i].startsWith("A")||str[i].startsWith("E")||str[i].startsWith("e")||str[i].startsWith("i")||str[i].startsWith("I")||
					str[i].startsWith("i")||str[i].startsWith("o")||str[i].startsWith("O")||str[i].startsWith("u")||str[i].startsWith("U"))==false)
			{
				System.out.print(str[i]+" ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Q3_StartsWithVowel obj=new Q3_StartsWithVowel();
		obj.input();
		obj.check();

	}

}
