package stringassignment_5august2022;

import java.util.Scanner;

public class Q10_Replace_All_User {
	String s;
	char re;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter String: ");
		s=sc.nextLine();
		System.out.println("Enter char for replace :");
		re=sc.next().charAt(0);
	}
	public void replace()
	{
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=re;
		}
		System.out.print("After replacing: ");
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
	}
	public static void main(String[] args) {
		Q10_Replace_All_User obj=new Q10_Replace_All_User();
		obj.input();
		obj.replace();

	}

}

