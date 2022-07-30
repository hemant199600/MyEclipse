package Assignment25july;

import java.util.Scanner;

public class Occurence_Array {

	static Scanner sc=new Scanner(System.in);
	public void input(int a[])
	{
		System.out.println("Enter array Elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public void occur(int a[])
	{
		System.out.println("Enter element for search: ");
		int el=sc.nextInt();
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==el)
			{
				c++;
			}
		}
		if(c>0)
			System.out.println("Your Element found "+c+" times");
		else
			System.out.println("Element not found.");
	}
	public static void main(String[] args) {
		Occurence_Array ar=new Occurence_Array();
		System.out.println("Enter size for array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		ar.input(a);
		ar.display(a);
		ar.occur(a);

	}

}
