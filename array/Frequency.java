package array;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size,c;
		int lock=-1;
		System.out.println("Enter Size: ");
		size=sc.nextInt();
		int a[]=new int[size];
		int count[]=new int[a.length];
		
		//inputing array
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//printing array
		System.out.println(" Entered array element: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//counting frequency
		for(int i=0;i<a.length;i++)
		{
			c=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
					count[j]=lock;
				}
			}
			if(count[i]!=lock)
				count[i]=c;
		}
		//printing frequency
		System.out.println(" frequency of array element: ");
		System.out.println("Element\tFrequency");
		for(int i=0;i<a.length;i++)
		{
			if(count[i]!=lock)
			System.out.println(a[i]+"\t"+count[i]);
		}
	}

}
