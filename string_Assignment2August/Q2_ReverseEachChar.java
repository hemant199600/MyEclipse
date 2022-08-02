package string_Assignment2August;

import java.util.Scanner;

public class Q2_ReverseEachChar {

	Scanner sc=new Scanner(System.in);
	public void rev()
	{
		System.out.println("Enter String");
		String s=sc.nextLine();
		System.out.println("Entered string :"+s);
		System.out.print("After Reversing :");
		String[] s1=s.split("");
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]);
		}
		
	}
	public static void main(String[] args) {
		
		Q2_ReverseEachChar obj=new Q2_ReverseEachChar();
		obj.rev();
	}

}
