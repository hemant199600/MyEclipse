package no_returntype_with_argument;

import java.util.Scanner;

public class Thirteen {
	int c[];
	public void calc(int a[],int b[])
	{
		int r=b.length-1;
		int j=0;
		c=new int[a.length+b.length];
		for(int i=0;i<c.length;i++)
		{
			if(i%2==0)
			{
				c[i]=a[j];
				j++;
			}
			else
			{
				c[i]=b[r];
				r--;
			}
		}
	}
	public void display(int[]a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public void display()
	{
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []b=new int[] {1,2,3,4,5};
		int []a=new int[] {10,20,30,40,50};
		Thirteen th=new Thirteen();
		System.out.println("First Array:");
		th.display(a);
		System.out.println("Second Array:");
		th.display(b);
		th.calc(a, b);
		System.out.println("Third Array:");
		th.display();
		
	}

}
