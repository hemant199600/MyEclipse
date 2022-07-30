package constructor;

import java.util.Scanner;

public class Eighth {
	Scanner sc=new Scanner(System.in);
	int a[];
	int size;
	Eighth()
	{
		System.out.println("Enter size of array: ");
		size=sc.nextInt();
		a=new int[size];
		System.out.println("Enter matrix:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	
	public int sort()
	{
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
				
			}
			
		}
		return a[2];
		
	}
	public void display()
	{
		System.out.println("Array elements are: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Eighth e=new Eighth();
		e.display();
		System.out.println("Third maximum element is: "+e.sort());
		

	}

}
