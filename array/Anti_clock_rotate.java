package array;

import java.util.Scanner;

public class Anti_clock_rotate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size: ");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter how many times of rotation: ");
		int r=sc.nextInt();
		int temp;
		for(int i=0;i<r;i++)
		{
			temp=a[a.length-1];
			for(int j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[0]=temp;
		}
		System.out.println("After rotation: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
