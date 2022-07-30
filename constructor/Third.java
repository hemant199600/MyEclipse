package constructor;

import java.util.Scanner;

public class Third {
	Scanner sc=new Scanner(System.in);
	int a[][],n,c=0;
	int row;
	int col;
	Third()
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
	
	public void find()
	{
		System.out.println("Enter Searching Elements:");
		n=sc.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(a[i][j]==n)
				{
					c++;
				}
			}
			
		}
		if(c>0)
		{
			System.out.println(n+" repeated "+c+" times.");
		}
		else
		{
			System.out.println();
		}
	}
	public void display()
	{
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
		Third t=new Third();
		t.display();
		t.find();
		

	}

}
