package string_Assignment2August;

import java.util.Scanner;

public class Q14_Swap_LastTwo {

	public void swapLast(String s)
	{
		String[] s1=s.split("");
		String temp=s1[s1.length-1];
		s1[s1.length-1]=s1[s1.length-2];
		s1[s1.length-2]=temp;
		for(int i=0;i<s1.length;i++)
		{
			System.out.print(s1[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Q14_Swap_LastTwo obj=new Q14_Swap_LastTwo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String s=sc.nextLine();
		System.out.println("Entered String :"+s);
		System.out.print("After Swap:");
		obj.swapLast(s);
		
	}

}
