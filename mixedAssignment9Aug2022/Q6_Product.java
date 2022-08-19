/*6. Given an array nums[] of size n, construct a Product Array P (of same size n) 
such that P[i] is equal to the product of all the elements of nums except nums[i].
Input:
n = 5
nums[] = {10, 3, 5, 6, 2}
Output:
180 600 360 300 900
Explanation: 
For i=0, P[i] = 3*5*6*2 = 180.
For i=1, P[i] = 10*5*6*2 = 600.
For i=2, P[i] = 10*3*6*2 = 360.
For i=3, P[i] = 10*3*5*2 = 300.
For i=4, P[i] = 10*3*5*6 = 900.
*/

package mixedAssignment9Aug2022;

import java.util.Scanner;

public class Q6_Product {
	Scanner sc=new Scanner(System.in);
	int prod[];
	public int[] input()
	{
		System.out.println("Enter size:");
		int size=sc.nextInt();
		int a[]=new int[size];
		prod=new int[a.length];
		System.out.println("Enter Array elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
	public int[] calculate(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			int sum=1;
			for(int j=0;j<a.length;j++)
			{
				if(i!=j)
				{
					sum*=a[j];
				}
			}
			prod[i]=sum;
		}
		return prod;
	}
	public void display(int a[])
	{
		System.out.println("Array elements: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		Q6_Product obj=new Q6_Product();
		int a[]=obj.input();
		System.out.println("Given array");
		obj.display(a);
		System.out.println("After calculating:");
		obj.display(obj.calculate(a));

	}

}
