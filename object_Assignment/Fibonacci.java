package object_Assignment;

import java.util.Scanner;

public class Fibonacci {
	int range;
	Scanner sc;
	
	public void input()
	{
		sc=new Scanner(System.in);
		System.out.println("Enter range : ");
		range=sc.nextInt();
	}
	public void fib()
	{
		int a=0,b=1,c;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<range;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		Fibonacci fb=new Fibonacci();
				fb.input();
				fb.fib();

	}

}
