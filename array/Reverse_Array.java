package array;

import java.util.Scanner;

public class Reverse_Array {

	int a[];
	int b[];
	Scanner sc=new Scanner(System.in);
	public void  inputArray(int size)
	{
		System.out.println("Enter array:");
		a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public void reverse()
	{
		b=new int[a.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[j]=a[i];
			j++;
		}
	}
	public void display()
	{
		System.out.println("Array Elements before reversing:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Array Elements After reversing:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
	public static void main(String[] args) {
		Reverse_Array obj=new Reverse_Array();
		obj.inputArray(5);
		obj.reverse();
		obj.display();

	}

}
