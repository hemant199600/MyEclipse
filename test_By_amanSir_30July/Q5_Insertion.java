package test_By_amanSir_30July;

import java.util.Scanner;

public class Q5_Insertion {

	Scanner sc=new Scanner(System.in);
	public void input(int a[],int size)
	{
		System.out.println("Enter Array:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
	}
	public void display(int a[],int size)
	{
		System.out.println("----Printing Array:----");
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public void insert(int a[],int pos,int el)
	{
		for(int i=a.length-1;i>pos-1;i--)
		{
			a[i]=a[i-1];
		}
		a[pos-1]=el;
	}
	public static void main(String[] args) {
		Q5_Insertion in=new Q5_Insertion();
		System.out.println("Enter size:");
		int size=in.sc.nextInt();
		int a[]=new  int[size+1];
		in.input(a,size);
		in.display(a,size);
		System.out.println("Enter Position:");
		int pos=in.sc.nextInt();
		System.out.println("Enter Element: ");
		int el=in.sc.nextInt();
		in.insert(a, pos, el);
		in.display(a, size+1);
		

	}

}


