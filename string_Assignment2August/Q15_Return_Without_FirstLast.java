package string_Assignment2August;

import java.util.Scanner;

public class Q15_Return_Without_FirstLast {

	public String swap(String s)
	{
		if(s.charAt(0)==s.charAt(s.length()-1))
		{
			return s.substring(1,s.length()-2);
		}
		return s;
	}
	public void display(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Q15_Return_Without_FirstLast obj=new Q15_Return_Without_FirstLast();
		System.out.print("Enter String : ");
		String s=sc.nextLine();
		System.out.println("\nEntered String : "+s);
		System.out.print("After Checking: ");
		obj.display(obj.swap(s));
		
	}

}
