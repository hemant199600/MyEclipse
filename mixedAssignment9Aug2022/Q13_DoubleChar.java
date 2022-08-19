package mixedAssignment9Aug2022;

import java.util.Scanner;

public class Q13_DoubleChar {
	String s;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter string: ");
		{
			s=sc.nextLine();
		}
	}
	public void makeDouble()
	{
		char ch[]=s.toCharArray();
		String doubleString="";
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<2;j++)
			{
				doubleString+=ch[i];
			}
		}
		System.out.println("After converting: "+doubleString);
	}
	public static void main(String[] args) {
		Q13_DoubleChar obj=new Q13_DoubleChar();
		obj.input();
		obj.makeDouble();

	}

}
