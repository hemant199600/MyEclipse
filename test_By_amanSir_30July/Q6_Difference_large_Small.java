package test_By_amanSir_30July;

import java.util.Scanner;

public class Q6_Difference_large_Small {

	int size,a[];
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter the size: ");
		size=sc.nextInt();
		if(size<2)
		{
			System.out.println("Enter the size more than 2");
			input();
		}
		a=new int [size];
		System.out.println("----------Enter Array-----------");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public void display()
	{
		System.out.println("----------Entered Array-----------");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public void diff()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[j];
						a[j]=a[i];
						a[i]=temp;
				}
			}
		}
		System.out.println("Difference of Largest and Samallest:"+(a[a.length-1]-a[0]));
	}
	
	public static void main(String[] args) {
		Q6_Difference_large_Small dif=new Q6_Difference_large_Small();
		dif.input();
		dif.display();
		dif.diff();

	}

}
