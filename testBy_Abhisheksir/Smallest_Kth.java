package testBy_Abhisheksir;

import java.util.Scanner;

public class Smallest_Kth {

	public int sort(int a[],int k)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		
		return a[k-1];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("Entered Array Element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array Element: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Enter Position of K:");
		int k=sc.nextInt();
		Smallest_Kth kth=new Smallest_Kth();
		System.out.println(k+"smallest element is: "+(kth.sort(a, k)));
	}

}
