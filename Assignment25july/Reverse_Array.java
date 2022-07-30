package Assignment25july;

import java.util.Scanner;

public class Reverse_Array {

	int a[];
	static Scanner sc=new Scanner(System.in);
	public Reverse_Array(int a[]) {
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
	public void display()
	{
		System.out.println(" array Elements: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public void reverse()
	{
		System.out.println(" Reverse array Elements: ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.println("Enter size of an array: ");
		int size=sc.nextInt();
		int a[]=new int[size];
		Reverse_Array rv=new Reverse_Array(a);
		rv.input();
		rv.display();
		rv.reverse();

	}

}
