package Assignment_Matrix;

import java.util.Scanner;

public class Q6Search {
	Scanner sc=new Scanner(System.in);
	public void search()
	{
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("enter Searching Element: ");
		int n=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j]==n)
				{
					System.out.println("Element found at "+(i+1)+" row and "+(j+1)+" column");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Q6Search obj=new Q6Search();
		obj.search();

	}

}
