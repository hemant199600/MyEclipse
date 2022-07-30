package Assignment25july;

import java.util.Scanner;

public class Search_From_Array {
	
	int a[];
	static Scanner sc=new Scanner(System.in);
	public Search_From_Array(int a[]) {
		this.a=a;
	}
	public void input()
	{
		System.out.println("Enter array Elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public void search()
	{
		System.out.println("Enter Searching Elements: ");
		int el=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==el)
			{
				System.out.println("Element found at "+(i+1)+" position.");
				break;
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter size of an array: ");
		int size=sc.nextInt();
		int a[]=new int[size]; 
		Search_From_Array sa=new Search_From_Array(a);
		sa.input();
		sa.search();

	}

}
