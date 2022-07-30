package no_returntype_with_argument;

import java.util.Scanner;

public class Five {

	int  c = 0, n1,n2;
	Scanner sc = new Scanner(System.in);

	public void input( ) {
		System.out.println("Enter two Element for Searching:");
		n1=sc.nextInt();
		n2=sc.nextInt();
	}

	public void search(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n1)
			{
				for(int j=0;j<a.length;j++)
				{
					if(a[j]==n2)
					{
						c=1;
					}
				}
			}	
		}
	}
	public void display()
	{
		if(c==1)
		{
			System.out.println("Element Found.");
		}
		else
		{
			System.out.println("Element not found.");
		}
	}

	public static void main(String[] args) {
		Five s = new Five();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter Array Element:");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			
		}
		s.input();
		s.search(a);
		s.display();
	}

}



