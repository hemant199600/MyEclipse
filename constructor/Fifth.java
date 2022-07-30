package constructor;

import java.util.Scanner;

public class Fifth {
	Scanner sc=new Scanner(System.in);
	int a[][],n,sum=0,c;
	int row;
	int col;
	Fifth()
	{
		System.out.println("Enter size of row and column of matrix: ");
		row=sc.nextInt();
		col=sc.nextInt();
		a=new int[row][col];
		System.out.println("Enter matrix:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	}
	
	public void select()
	{
		System.out.println("Enter row number:");
		n=sc.nextInt();
		for(int i=n-1;i<n;i++)
		{
			for(int j=0;j<col;j++)
			{
				sum=sum+a[i][j];
				c++;
			}
			
		}
		if(c>0)
		{
			System.out.println("Sum of "+n+" row is: "+sum);
		}
		else
		{
			System.out.println("Enter valid row.");
		}
	}
	public void display()
	{
		System.out.println("Array elements are: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Fifth f=new Fifth();
		f.display();
		f.select();
		

	}

}
