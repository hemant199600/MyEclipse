package constructor;

import java.util.Scanner;

public class Fifteen {
	Scanner sc=new Scanner(System.in);
	int a[],pos,el,c;
	public Fifteen(int []x,int s) {
		System.out.println("Enter Array Elements: ");
		for(int i=0;i<s;i++)
		{
			x[i]=sc.nextInt();
		}
		a=x;
		c=s;
		this.display(c);
	}
	public void insert(int x[])
	{
		
		System.out.println("Enter Adding Element: ");
		el=sc.nextInt();
		System.out.println("Enter position: ");
		pos=sc.nextInt();
		int i;
		for( i=x.length-1;i>pos-1;i--)
		{
			x[i]=x[i-1];
		}
		x[i]=el;
		this.display(c+1);
		
	}
	public void display(int s)
	{
		System.out.println("Array Elements are: ");
		for(int i=0;i<s;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int size=sc.nextInt();
		int a[]=new int[size+1];
		Fifteen ft=new Fifteen(a,size);
		ft.insert(a);
		
	}

}
