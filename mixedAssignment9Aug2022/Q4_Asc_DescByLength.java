package mixedAssignment9Aug2022;

import java.util.Scanner;

public class Q4_Asc_DescByLength {

	String s;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter string: ");
		{
			s=sc.nextLine();
		}
	}
	public String[] asc()
	{
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].length()>str[j].length())
				{
					String temp=str[j];
					str[j]=str[i];
					str[i]=temp;
				}
			}
		}
		return str;
	}
	public String[] desc()
	{
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].length()<str[j].length())
				{
					String temp=str[j];
					str[j]=str[i];
					str[i]=temp;
				}
			}
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
		Q4_Asc_DescByLength obj=new Q4_Asc_DescByLength();
		obj.input();
		System.out.println("Ascending order by length : ");
		obj.display(obj.asc());
		System.out.println("Descending order by length : ");
		obj.display(obj.desc());

	}

}
