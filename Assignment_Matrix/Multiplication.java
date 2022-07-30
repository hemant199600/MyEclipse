package Assignment_Matrix;

import java.util.Scanner;

public class Multiplication {

	int a[][];
	int b[][];
	int c[][];
	int s1;
	public Multiplication() {
		System.out.println("Enter Size of matrix first:");
		s1=sc.nextInt();
		a=new int [s1][s1];
		b=new int [s1][s1];
		c=new int[s1][s1];
	}
	static Scanner sc=new Scanner(System.in);
	public void inputArray()
	{
		System.out.println("Enter First Array Elements: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Second Array Elements: ");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
	}
	public void mult()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				for(int k=0;k<a.length;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
	}
	public void display()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void disp()
	{
		System.out.println("First Array:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Second Array:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Multiplication m1=new Multiplication();
		
		m1.inputArray();
		m1.disp();
		m1.mult();
		System.out.println("multiplication of an array is: ");
		m1.display();
		
		
	}

}
