package array;

import java.util.Scanner;

public class Second_Lowest {
	static Scanner sc=new Scanner(System.in);
	public void min(int a[])
	{
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		int smin=999999999;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=min&&smin>a[i])
			{
				smin=a[i];
			}
		}
		System.out.println("Second Minimum Element:"+smin);
	}
	public int[] inputArray(int size)
	{
		System.out.println("Enter Array Elements: ");
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
	public static void main(String[] args) {
		Second_Lowest obj=new Second_Lowest();
		System.out.println("Enter size: ");
		int size=sc.nextInt();
		obj.min(obj.inputArray(size));
	}

}
