package Assignment_Matrix;

import java.util.Scanner;

public class Q8Delete_By_User {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		boolean f=false;
		int size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("enter array: ");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		System.out.print("Array Element: ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		
		System.out.println("Enter Element for deletion:");
		int el=sc.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==el)
			{	
				f=false;
				for(int j=i;j<(a.length-1);j++)
				{
					a[j]=a[j+1];
				}
			}
			else
			{
				f=true;
			}
		}
		if(f==true)
		{
			System.out.println("Element not found.");
		}
		else
		{
			System.out.print("After Deletion: ");
			for(int i=0;i<a.length-1;i++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
	}

}
