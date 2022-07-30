package constructor_this;

import java.util.Scanner;

public class CallingClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements.");
		int a[]=new int [5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Array_Printing ap=new Array_Printing(a);
	}

}
