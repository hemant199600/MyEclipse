package constructor;

import java.util.Scanner;

public class Thirteen {
	int r;
	Scanner sc;
	Thirteen()
	{
		sc=new Scanner(System.in);
		System.out.println("Enter range: ");
		r=sc.nextInt();
	}
	public void form()
	{
		for(int i=r;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Thirteen th=new Thirteen();
		th.form();
	}

}
