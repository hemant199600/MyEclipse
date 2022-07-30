package no_returntype_with_argument;
import java.util.*;
public class Twelve {
	int i;
	
	public void logic(int a[], int b[], int c[])
	{
		for(i=0; i<a.length; i++)
			c[i]=a[i];
		
		for(i=0; i<b.length; i++)
			c[a.length+i]=b[i];
			
	}
	
	public void disp(int a[], int b[], int c[])
	{
		System.out.println("after merging c=");
		for(i=0; i<c.length; i++)
			System.out.print(c[i]+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Twelve obj=new Twelve();
		Scanner in=new Scanner(System.in);
		int i;
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[a.length+b.length];
		System.out.println("enter the 1st array elements");
		for(i=0; i<a.length; i++)
		a[i]=in.nextInt();
		
		System.out.println("enter the 2nd array elements");
		for(i=0; i<b.length; i++)
		b[i]=in.nextInt();
		
		obj.logic(a, b, c);
		obj.disp(a, b, c);
		

	}

}
