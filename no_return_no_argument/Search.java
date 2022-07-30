package no_return_no_argument;

import java.util.Scanner;
public class Search {
	int a[],c=0,n;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter size: ");
		int size=sc.nextInt();
		a=new int[size];
		System.out.println("Enter Array Element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Element for search: ");
		n=sc.nextInt();
	}
	public void search()
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
				c++;
		}
	}
	public void display()
	{
		if(c>0)
			System.out.println(n+" found "+c+" times.");
		else
			System.out.println("element not found.");
	}
	public static void main(String[] args) {
		Search s=new Search();
		s.input();
		s.search();
		s.display();

	}

}
