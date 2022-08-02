package testBy_amanSir_1August;

import java.util.Scanner;

public class Q7_EqualIgnore {

	Scanner sc=new Scanner(System.in);
	public String input()
	{
		System.out.println("Enter String: ");
		String s=sc.nextLine();
		return s;
	}
	public boolean compare(String s1,String s2)
	{
		return s1.equalsIgnoreCase(s2);
	}
	public static void main(String[] args) {
		Q7_EqualIgnore obj=new Q7_EqualIgnore();
		System.out.println("Enter two Strings: ");
		if(obj.compare(obj.input(), obj.input()))
		{
			System.out.println("Strings are Equal: ");
		}
		else
		{
			System.out.println("Strings are not Equal: ");
		}

	}

}
