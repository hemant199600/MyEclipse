package constructor;

import java.util.Scanner;

public class Fourth {
	Scanner sc=new Scanner(System.in);
	int a[][],n,m,sum;
	int row;
	int col;
	Fourth()
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
		System.out.println("Select Elements:");
		n=sc.nextInt();
		m=sc.nextInt();
		int c=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(a[i][j]==n)
				{
					for(int i1=0;i1<row;i1++)
					{
						for(int j1=0;j1<col;j1++)
						{
							if(a[i1][j1]==m)
							{
								sum=sum+a[i][j]+a[i1][j1];
								c++;
							}
							
						}
						
					}
				}
				
			}
			
		}
		if(c>0)
		{
			System.out.println("Sum of selected element: "+sum);
		}
		else{
			System.out.println("Please select elements from matrix ....?");
		}
	}
	public void display()
	{
		System.out.println("Array element: ");
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
		Fourth f=new Fourth();
		f.display();
		f.find();
		

	}

}
