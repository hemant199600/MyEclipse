package constructor;

import java.util.Scanner;

public class Fourteen {
	int r;
	Scanner sc;
	Fourteen()
	{
		sc=new Scanner(System.in);
		System.out.println("Enter range: ");
		r=sc.nextInt();
	}
	public void form()
	{
		for(int i=1;i<=r;i++)
		{
			for(int j=i;j<=r;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Fourteen fu=new Fourteen();
		fu.form();
	}

}
