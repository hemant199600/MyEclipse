package Assignment25july;

import java.util.Scanner;

public class Inserting_Array {

	int a[];
	static Scanner sc=new Scanner(System.in);
	public Inserting_Array(int a[]) {
		this.a=a;
	}
	public void input(int size)
	{
		System.out.println("Enter array Elements: ");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public void display(int size)
	{
		System.out.println(" array Elements: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public void start_position(int size)
	{
		System.out.println("Enter no for adding element at Starting position: ");
		int el=sc.nextInt();
		int i;
		for(i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[i]=el;
	}
	public void middle_position(int size)
	{
		System.out.println("Enter no for adding element at Middle position: ");
		int el=sc.nextInt();
		int i;
		for(i=a.length-1;i>a.length/2;i--)
		{
			a[i]=a[i-1];
		}
		a[i]=el;
	}
	public void end_position(int size)
	{
		System.out.println("Enter no for adding element at End position: ");
		int el=sc.nextInt();
		int i;
		for(i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[i]=el;
	}
	public void positionByUser(int size)
	{
		System.out.println("Enter position for Add: ");
		int pos=sc.nextInt();
		System.out.println("Enter no for adding element at End position: ");
		int el=sc.nextInt();
		int i;
		for(i=a.length-1;i>pos-1;i--)
		{
			a[i]=a[i-1];
		}
		a[i]=el;
	}
	public static void main(String[] args) {
		System.out.println("Enter size of an array: ");
		int size=sc.nextInt();
		int a[]=new int[size+1];
		Inserting_Array rv=new Inserting_Array(a);
		rv.input(size);
		rv.display(size);
		rv.start_position(size+1);
		rv.display(size+1);
		rv.middle_position(size+1);
		rv.display(size+1);
		rv.end_position(size+1);
		rv.display(size+1);
		rv.positionByUser(size+1);
		rv.display(size+1);
	}

}
