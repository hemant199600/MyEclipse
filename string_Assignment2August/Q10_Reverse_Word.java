package string_Assignment2August;

import java.util.Scanner;

public class Q10_Reverse_Word {

	Scanner sc=new Scanner(System.in);
	public void rev(String s)
	{
		String[] sa=s.split(" ");
		for(int i=sa.length-1;i>=0;i--)
		{
			System.out.print(sa[i]+" ");
		}
	}
	public String input()
	{
		return sc.nextLine();
	}
	public void display(String s)
	{
		System.out.println("Enterd String: "+s);
	}
	public static void main(String[] args) {
		Q10_Reverse_Word obj =new Q10_Reverse_Word();
		System.out.println("Enter String");
		String s=obj.input();
		obj.display(s);
		obj.rev(s);
	}

}
