package classprograms;

import java.util.Scanner;

public class This_2 {
	Scanner sc=new Scanner(System.in);
	int a[];
	This_2()
	{
		a=new int[5];
		this.input();
		this.print();
	}
	public void input()
	{
		System.out.println("Enter array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public void print()
	{
		System.out.println("Array elements:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		This_2 th2=new This_2();

	}

}
