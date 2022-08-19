package mixedAssignment9Aug2022;

import java.util.Scanner;

public class Q2_ArrayTriplet {

	Scanner sc=new Scanner(System.in);
	int a[];
	public void input()
	{
		System.out.println("Enter size of an array: ");
		int n=sc.nextInt();
		a=new int[n];
		System.out.println("Input an array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public void findTriplet()
	{
		System.out.println("Enter value to find triplet: ");
		int x=sc.nextInt();
		for(int i=0;i<a.length-2;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if((a[i]+a[j]+a[k]==(x-i))||(a[i]+a[j]+a[k]==(x-j))||(a[i]+a[j]+a[k]==(x-k)))
					{
						System.out.println((a[i]+a[j]+a[k])+" triplet find at ["+(i+1)+" "+(j+1)+" "+(k+1)+"] position.");
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Q2_ArrayTriplet obj=new Q2_ArrayTriplet();
		obj.input();
		obj.findTriplet();

	}

}
