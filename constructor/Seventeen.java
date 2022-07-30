package constructor;

import java.util.Scanner;

public class Seventeen {
	int a[][],b[][];
	Scanner sc;
	Seventeen()
	{
		a= new int[][]{
			{1,2,3},{2,5,6},{3,6,9}
		};
		b=new int[a.length][a[0].length];
	}
	public void display()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void transpose()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				b[i][j]=a[j][i];
			}
		}
	}
	public boolean check()
	{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j]==b[i][j])
				{
					c=1;
				}
				else
				{
					c=0;
					break;
				}
			}
		}
		if(c==1)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Seventeen sv=new Seventeen();
		System.out.println("Given matrix.");
		sv.display();
		sv.transpose();
		if(sv.check())
		{
			System.out.println("Given matrix is Symmetric matrix: ");
		}
		else
		{
			System.out.println("Given matrix is not Symmetric: ");
		}
	}

}
/*
 * 1 2 3  transpose     1 4 7   symmetric		1 2 3
 * 4 5 6  ------------> 2 5 6 -------------->	2 5 6
 * 7 8 9                3 6 9					3 6 9
 */

 
