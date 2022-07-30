package constructor;

import java.util.Scanner;

public class Second {
	Scanner sc=new Scanner(System.in);
	int a[][];
	int row;
	int col;
	Second()
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
	
	
	public void display()
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("["+i+"]["+j+"]"+a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Second s=new Second();
		s.display();

	}

}
