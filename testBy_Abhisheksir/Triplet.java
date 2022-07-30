package testBy_Abhisheksir;

import java.util.Scanner;

public class Triplet {
	static Scanner sc=new Scanner(System.in);
	public int [] inputArray(int a[])
	{
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		return a;
	}
	public boolean triplet(int a[],int el)
	{
		for(int i=0;i<a.length-2;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if(a[i]+a[j]+a[k]==el-i||a[i]+a[j]+a[k]==el-j||a[i]+a[j]+a[k]==el-k)
					{
						return true;
					}
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Triplet t=new Triplet();
		int a[]=new int[5];
		System.out.print("Enter an array Element: ");
		a=t.inputArray(a);
		if(t.triplet(a, 30))
		{
			System.out.println("triplet found.");
		}
		else
		{
			System.out.println("not found any triplet.");
		}

	}

}
