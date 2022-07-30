package classprograms;

import java.util.Scanner;

public class Sorting_Constructor {
	int a[];
	Scanner sc=new Scanner(System.in);
	
	public Sorting_Constructor() {
		System.out.println("Enter size:");
		int size=sc.nextInt();
		a=new int[size];
		System.out.println("Enter Array Element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public void sort()
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
	public void display()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Sorting_Constructor so=new Sorting_Constructor();
		System.out.println("Before Sorting:");
		so.display();
		so.sort();
		System.out.println("After Sorting:");
		so.display();
	}

}
