package classprograms;

import java.util.Scanner;

public class Prime_N {
	Scanner sc=new Scanner(System.in);
	int c[];
	public  void input(int a[])
	{
		System.out.print("Enter Array Elements:");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println();
		c=new int[a.length];
	}
	public void countDisplay(int a[])
	{
		int c=0;
		System.out.print("Prime Array Elements are:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				c++;
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Count of prime number: "+c);
	}
	public int [] count(int a[])
	{
		int j;
		for(int i=0;i<a.length;i++)
		{
			for(j=2;j<=a[i];j++)
			{
				if(a[i]%j==0)
					break;
			}
			if(a[i]==j)
			{
				c[i]=a[i];
			}
		}
		return c;
	}
	public void display(int []a)
	{
		for(int i=0;i<a.length;i++)
		{
			
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Prime_N pn=new Prime_N();
		int a[]=new int[10];
		pn.input(a);
		System.out.println("Entered Array Elements :");
		pn.display(a);
		int c[]=pn.count(a);
		pn.countDisplay(c);
		
		
	}

}
