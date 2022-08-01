package test_By_amanSir_30July;

import java.util.Scanner;

public class Q3_AntiClock {

	Scanner sc=new Scanner(System.in);
	public void input(int a[])
	{
		System.out.println("Enter Array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
	}
	public void rotate(int a[],int t)
	{
		for(int i=0;i<t;i++)
		{
			int temp=a[a.length-1],j;
			for(j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[j]=temp;
		}
	}
	public void display(int a[])
	{
		System.out.println("----Printing Array:----");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Q3_AntiClock aq=new Q3_AntiClock();
		System.out.println("Enter size:");
		int size=aq.sc.nextInt();
		int a[]=new  int[size];
		aq.input(a);
		aq.display(a);
		System.out.println("How many times you want to rotate: ");
		int r=aq.sc.nextInt();
		aq.rotate(a, r);
		aq.display(a);
		

	}

}
