package constructor;

import java.util.Scanner;

public class Nineth {
	Scanner sc=new Scanner(System.in);
	int a[][],n,esum,osum,ec,oc;
	int row;
	int col;
	Nineth()
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
	
	public void sumEvenOdd()
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(a[i][j]%2==0)
				{
					 esum=esum+a[i][j];
					 ec++;
				}
				else 
				{
					osum=osum+a[i][j];
					 oc++;
				}
			}
			
		}
		System.out.println("Sum of "+ec+" Even number  is: "+esum);
		System.out.println("Sum of "+oc+" Odd number  is: "+osum);
	
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
		Nineth n=new Nineth();
		n.display();
		n.sumEvenOdd();

	}

}
