package array;

import java.util.Scanner;

public class Lowest_Kth {

	int temp[];
	int j=0;
	int b[];
	int lmin;
	Scanner sc=new Scanner(System.in);
	public void lowest(int a[],int rep)
	{
		temp=new int[a.length];
		b=new int[a.length];
		int min=Integer.MAX_VALUE;
		if(j<rep)
		{	
			for(int i=0;i<a.length;i++)
			{
				if(a[i]<min)
				{
					min=a[i];
				}
			}
			lmin=min;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==min)
				{
					a[i]=Integer.MAX_VALUE;
					b[i]=a[i];
				}
				else
				{
					b[i]=a[i];
				}
			}
		}
		else
		{
			return;
		}
		j++;
		lowest(b,rep);
	}
	public void display(int k)
	{
		System.out.println(k+" lowest:"+lmin);
	}
	public static void main(String[] args) {
		Lowest_Kth obj=new Lowest_Kth();
		System.out.println("Enter kth element: ");
		int k=obj.sc.nextInt();
		int a[]= {1,2,4,5,6,7};
		System.out.println("Array elements: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println();
		obj.lowest(a, k);
		obj.display(k);
	}

}
