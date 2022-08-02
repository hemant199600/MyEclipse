package testBy_amanSir_1August;

import java.util.Scanner;

public class Q15_RemoveLast {

	Scanner sc=new Scanner(System.in);
	public String input()
	{
		System.out.println("Enter String: ");
		String s=sc.nextLine();
		return s;
	}
	public void print(String s)
	{
		System.out.println(s.substring(0, s.length()-1));
	}
	public static void main(String[] args) {
		Q15_RemoveLast obj=new Q15_RemoveLast();
		String s=obj.input();
		obj.print(s);
	}

}
