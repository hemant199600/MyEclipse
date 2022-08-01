package array;

import java.util.Scanner;

public class MostR {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int lock=-1;
		int c=0;
		System.out.println("Enter size: ");
		int size=sc.nextInt();
		int a[]=new int[size];
		int count[]=new int[a.length];		
		System.out.println("Enter Array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
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
				count[i]=c;
		}
		for(int i=0;i<count.length;i++)
		{
			for(int j=i+1;j<count.length;j++)
			{
				if(count[i]<count[j])
				{
					int temp=count[j];
					count[j]=count[i];
					count[i]=temp;
				}
			}
		} 
		System.out.println("Array Element: ");
		for(int i=0;i<count.length;i++)
			System.out.print(a[i]+" ");
		System.out.println("Count Element:");
		for(int i=0;i<count.length;i++)
			System.out.print(count[i]+" ");
		
		int index=count[0];
		for(int i)
		
	}

}
