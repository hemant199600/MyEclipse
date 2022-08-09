package strings;

import java.util.Scanner;

public class No_To_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no1=123456;
		int a[]=new int[6];
		int i=5;
		while(no1!=0)
		{
			a[i]=no1%10;
			i--;
			no1=no1/10;
		}
		
		for(int j=0;j<6;j++)
		{
			System.out.print((a[j])+" ");
		}
		System.out.println();
		System.out.println("Enter position to access array element.");
		int in=sc.nextInt();
		System.out.println("your element is:"+a[in-1]);
	}

}
