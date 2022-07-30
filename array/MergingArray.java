package array;

import java.util.Scanner;

public class MergingArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s1,s2;
		System.out.print("Enter size of both array : ");
		s1=sc.nextInt();
		s2=sc.nextInt();
		int a[]=new int[s1];
		int b[]=new int[s2];
		int c[]=new int[a.length+b.length];
		
		//input first array
		System.out.println("Enter first array Element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//input first array
		System.out.println("Enter Second array Element:");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		//printing first array
		System.out.println("First Array Element:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		//input first array
		System.out.println("\nSecond Array Element:");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}
		System.out.println("\nmerging Array Element:");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}

}
