package string_Assignment2August;

import java.util.Scanner;

public class Q18_DoubleCharPrint {

	public char[] print(String s)
	{
		char[] a=s.toCharArray();
		char[] temp=new char[a.length*2];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<2;j++)
			{
				temp[k]=a[i];
				k++;
			}
		}
		return temp;
	}
	public void display(char[]a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		Q18_DoubleCharPrint pr=new Q18_DoubleCharPrint();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sc.nextLine();
		System.out.println("---------Entered String----------");
		pr.display(str.toCharArray());
		System.out.println("---------After----------");
		pr.display(pr.print(str));
	}

}
