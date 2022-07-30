package Assignment25july;

import java.util.Scanner;

public class Traversing {

	int a[];
	static Scanner sc =new Scanner(System.in);
	Traversing(int a[])
	{
		this.a=a;
	}
	public void input()
	{
		System.out.println("Enter Array Elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public void traverse()
	{
		System.out.println("Enter element for check position: ");
		int el=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==el)
			{
				System.out.println("Element Present at "+(i+1)+" position");
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
		System.out.println("Enter Size:");
		int size=sc.nextInt();
		int a[]=new int[size];
		Traversing tr=new Traversing(a);
		tr.input();
		tr.display();
		tr.traverse();

	}

}
