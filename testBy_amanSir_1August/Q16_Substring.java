package testBy_amanSir_1August;

import java.util.Scanner;

public class Q16_Substring {

	Scanner sc=new Scanner(System.in);
	public String input()
	{
		System.out.println("Enter String: ");
		String s=sc.nextLine();
		return s;
	}
	public void print(String s)
	{
		System.out.println("Enter Starting point: ");
		int start=sc.nextInt();
		System.out.println("Enter Ending point:");
		int end=sc.nextInt();
		System.out.println(s.substring(start, end));
	}
	public static void main(String[] args) {
		Q16_Substring obj=new Q16_Substring();
		String s=obj.input();
		obj.print(s);
	}

}
