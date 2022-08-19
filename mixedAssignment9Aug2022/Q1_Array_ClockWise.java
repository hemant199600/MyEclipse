package mixedAssignment9Aug2022;

import java.util.Scanner;

public class Q1_Array_ClockWise {
	Scanner sc=new Scanner(System.in);
	int a[]= {1,2,3,4,5};
	public void display()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public void rotate()
	{
		System.out.println("Enter how many times of rotate: ");
		int r=sc.nextInt();
		for(int i=0;i<r;i++)
		{
			int temp=a[0];
			int j;
			for(j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[j]=temp;
		}
	}
	public static void main(String[] args) {
		Q1_Array_ClockWise obj=new Q1_Array_ClockWise();
		obj.display();
		obj.rotate();
		obj.display();

	}

}
