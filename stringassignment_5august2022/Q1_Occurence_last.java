package stringassignment_5august2022;

import java.util.Scanner;

public class Q1_Occurence_last {

	String s;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter String: ");
		s=sc.nextLine();
	}
	public int occur()
	{
		int c=0;
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[a.length-1]==a[i])
			{
				
				c++;
			}
		}
		return c;
	}
	public static void main(String[] args) {
		Q1_Occurence_last obj=new Q1_Occurence_last();
		obj.input();
		System.out.println("Last occurence of character: "+obj.occur());
		
	}

}
