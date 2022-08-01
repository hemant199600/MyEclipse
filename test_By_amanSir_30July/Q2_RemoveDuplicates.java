package test_By_amanSir_30July;

import java.util.Scanner;

public class Q2_RemoveDuplicates {
	Scanner sc=new Scanner(System.in);
	
	public void inputAndDisplay(int a[])
	{
		System.out.println("Enter Array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Entered Array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public int [] remove(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=0;
				}
			}
		}
		return a;
	}
	public void display(int a[])
	{
		System.out.println("after removing Duplicates: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int a[];
		System.out.println("Enter Array size:");
		Q2_RemoveDuplicates rd=new Q2_RemoveDuplicates();
		int size=rd.sc.nextInt();
		a=new int[size];
		rd.inputAndDisplay(a);
		int b[]=rd.remove(a);
		rd.display(b);
		
		
	}

}
