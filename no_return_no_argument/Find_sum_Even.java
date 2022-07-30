package no_return_no_argument;

import java.util.Scanner;

public class Find_sum_Even {
	Scanner sc=new Scanner(System.in);
	int a[],sum,c;
	public void input()
	{
		System.out.println("Enter size of Array");
		int size=sc.nextInt();
		a=new int[size];
		System.out.println("Enter Array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	
	public void find()
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				c++;
				sum=sum+a[i];
			}
		}
	}
	public void display()
	{
		System.out.println("Array element are: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Sum: "+sum);
		System.out.println("Count :"+c);
	}
	public static void main(String[] args) {
		Find_sum_Even fd=new Find_sum_Even();
		fd.input();
		fd.find();
		fd.display();
	}

}
