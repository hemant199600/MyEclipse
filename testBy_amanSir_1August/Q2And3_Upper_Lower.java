package testBy_amanSir_1August;

import java.util.Scanner;

public class Q2And3_Upper_Lower 
{
	Scanner sc=new Scanner(System.in);
	public void upper(String s)
	{
		System.out.println(s.toUpperCase());
		System.out.println();
	}
	public void lower(String s)
	{
		System.out.println(s.toLowerCase());
	}
	public String input()
	{
		System.out.println();
		System.out.println("Enter String: ");
		String s=sc.nextLine();
		
		return s;
	}
	public static void main(String[] args) {
		Q2And3_Upper_Lower obj=new Q2And3_Upper_Lower();
		System.out.print("UpperCAse: ");
		obj.upper(obj.input());
		System.out.print("LowerCase: ");
		obj.lower(obj.input());
		

	}

}
