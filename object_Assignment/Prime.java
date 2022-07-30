package object_Assignment;

import java.util.Scanner;

public class Prime {
	Scanner sc;
	int no;
	public void input()
	{
		sc=new Scanner(System.in);
		System.out.println("Enter no: ");
		no=sc.nextInt();
	}
	public void prime()
	{
		int i;
		for(i=2;i<=no;i++)
		{
			if(no%i==0)
				break;
			
		}
		if(no==i)
		{
			System.out.println("prime no");
		}
		else
			System.out.println("Not prime no");
	}
	public static void main(String[] args) {
		Prime p=new Prime();
		p.input();
		p.prime();

	}

}
