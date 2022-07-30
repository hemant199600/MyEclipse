package Assignment_Matrix;

import java.util.Scanner;

public class Delete_All_Duplicate {
	Scanner sc=new Scanner(System.in);
public void duplicate()
{
	int lock=-1,c=1;
	System.out.println("Enter size: ");
	int size=sc.nextInt();
	int a[]=new int[size];
	int count[]=new int[a.length];
	System.out.println("Enter Array elements: ");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Array elements: ");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	for(int i=0;i<a.length;i++)
	{
		c=1;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				count[j]=lock;
				c++;
			}
			
		}
		if(count[i]!=lock)
		{
			count[i]=c;
		}
	}
	System.out.println();
	System.out.println("Array element after removing duplicate: ");
	for(int i=0;i<a.length;i++)
	{
		if(count[i]!=lock)
		{
			System.out.print(a[i]+" ");
		}
	}
}
	public static void main(String[] args) {
		Delete_All_Duplicate da=new Delete_All_Duplicate();
		da.duplicate();

	}

}
