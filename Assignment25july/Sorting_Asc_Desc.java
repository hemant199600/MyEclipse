package Assignment25july;

import java.util.Scanner;

public class Sorting_Asc_Desc {
	int a[];
	static Scanner sc=new Scanner(System.in);
	public Sorting_Asc_Desc(int a[]) {
		this.a=a;
	}
	public void input()
	{
		System.out.println("Enter array Elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public void ascending()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
	}
	public void descending()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
	}
	public void display()
	{

		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter size of an array: ");
		int size=sc.nextInt();
		int a[]=new int[size];
		Sorting_Asc_Desc so=new Sorting_Asc_Desc(a);
		so.input();
		System.out.print("Array Elements: ");
		so.display();
		System.out.println();
		System.out.print("Ascending order:");
		so.ascending();
		so.display();
		System.out.println();
		System.out.print("Descending order: ");
		so.descending();
		so.display();
	}

}
