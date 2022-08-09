package stringassignment_5august2022;

import java.util.Scanner;

public class Q11_LastOccurence_Word {
	String s;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter String: ");
		s=sc.nextLine();
	}
	public int occur()
	{
		int c=1;
		String a[]=s.split(" ");
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
		Q11_LastOccurence_Word obj=new Q11_LastOccurence_Word();
		obj.input();
		System.out.println("Last occurence of word: "+obj.occur());
		
	}
}
