package Assignment_Matrix;

import java.util.Scanner;

public class Q3Sum_Any {
	Scanner sc=new Scanner(System.in);
	public void sum()
	{
		int a[][]=new int[3][3];
		int sum=0;
		System.out.println("enter array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("----------Array------------");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Enter any three elements from matrix for sum: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]==x||a[i][j]==y||a[i][j]==z)
					sum=sum+a[i][j];
				
			}
			System.out.println();
		}
		System.out.println("Sum :"+sum);
		
	}
	public static void main(String[] args) {
		Q3Sum_Any obj=new Q3Sum_Any();
		obj.sum();
	}

}
