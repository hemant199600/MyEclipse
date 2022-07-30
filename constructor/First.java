package constructor;

import java.util.Scanner;

public class First {
	Scanner sc=new Scanner(System.in);
	int a[][];
	int b[][];
	int row;
	int col;
	First()
	{
		System.out.println("Enter size of row and column of matrix: ");
		row=sc.nextInt();
		col=sc.nextInt();
		a=new int[row][col];
		b=new int[row][col];
		System.out.println("Enter matrix:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	}
	public void transpose()
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				b[i][j]=a[j][i];
			}
		}
	}
	public void display1()
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public void display()
	{
		System.out.println("Transpose matrix: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		First f=new First();
		f.display1();
		f.transpose();
		f.display();

	}

}
