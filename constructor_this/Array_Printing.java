package constructor_this;

import java.util.Scanner;

public class Array_Printing {
	int a[];
	 Scanner sc;
	public Array_Printing(int a[],int s) {
		this.a=a;
		System.out.println("array in As order:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();

	}
	public void delete(Array_Printing ap)
	{
		sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter position for removing");
		int pos=sc.nextInt();
		int b[]=ap.a;
		for(int i=pos-1;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		System.out.println("After Deletion: ");
		for(int i=0;i<a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public Array_Printing(int a[])
	{
		this(a,5);
		
		System.out.println("Reverse order:");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		this.delete(this);
	}
}
