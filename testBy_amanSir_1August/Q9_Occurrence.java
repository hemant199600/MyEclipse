package testBy_amanSir_1August;

import java.util.Scanner;

public class Q9_Occurrence {

	Scanner sc=new Scanner(System.in);
	public String input()
	{
		System.out.println("Enter String: ");
		String s=sc.nextLine();
		return s;
	}
	public int  occur(String s)
	{
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(0)==s.charAt(i))
			{
				c++;
			}
		}
		return c;
	}
	public static void main(String[] args) {
		
		Q9_Occurrence obj=new Q9_Occurrence();
		String s=obj.input();
		System.out.println("Enterd Strings First Word repeated "+(obj.occur(s))+" times");
	}

}
