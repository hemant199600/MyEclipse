package methods;

import java.util.Scanner;

public class Array_pass {
	int b[];
	private void disp(int[] a) {
		b=a;
		System.out.println("Array element is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[(a.length-1)-i]+" ");
		}
	}
	public void disp()
	{
		System.out.println("\nArray in simple order");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("enter size ");
		int size=x.nextInt();
		int a[]=new int[size];
		System.out.println("Enter Array Element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=x.nextInt();
		}
		Array_pass ap=new Array_pass();
		ap.disp(a);
		ap.disp();
		
	}
	
}
