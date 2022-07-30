package array;

import java.util.Scanner;

public class Deletion_By_Position {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("enter array: ");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		System.out.print("Array Element: ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		
		System.out.println("Enter Position for deletion:");
		int pos=sc.nextInt();
		
		for(int i=pos-1;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		
		System.out.print("After Deletion: ");
		for(int i=0;i<a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
