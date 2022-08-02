package testBy_amanSir_1August;

import java.util.Scanner;

public class Q14_RemoveFirst {

	Scanner sc=new Scanner(System.in);
	public String input()
	{
		System.out.println("Enter String: ");
		String s=sc.nextLine();
		return s;
	}
	public void print(String s)
	{
		System.out.println(s.substring(1));
	}

	public static void main(String[] args) {
		Q14_RemoveFirst obj=new Q14_RemoveFirst();
		String s=obj.input();
		obj.print(s);

	}

}
