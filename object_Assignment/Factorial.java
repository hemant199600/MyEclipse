package object_Assignment;

import java.util.Scanner;

public class Factorial {
	int no;
	Scanner sc;
	public void input()
	{
		sc=new Scanner(System.in);
		System.out.println("Enter no:");
		no=sc.nextInt();
	}

	public void fact()
	{
		int fact=1;
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+no+" is: "+fact);
	}
	public static void main(String[] args) {
		Factorial f=new Factorial();
		f.input();
		f.fact();

	}

}
