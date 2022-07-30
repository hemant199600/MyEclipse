package methods;

import java.util.Scanner;

public class Factorial {
	public int fact(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		int f=sc.nextInt();
		Factorial fc=new Factorial();
		System.out.println("Factorial: "+fc.fact(f));
	}

}
