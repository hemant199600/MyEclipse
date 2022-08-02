package testBy_amanSir_1August;

import java.util.Scanner;

public class Q6_Concate {

	Scanner sc=new Scanner(System.in);
	public String input()
	{
		System.out.println("Enter String: ");
		String s=sc.nextLine();
		return s;
	}
	public static void main(String[] args) {
		Q6_Concate obj=new Q6_Concate();
		System.out.println("Enter two string for Concate: ");
		System.out.println("Concateneted String is:"+(obj.input().concat(obj.input())));
	}

}
