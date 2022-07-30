package methods;

import java.util.Scanner;

public class Prime_no {
Scanner sc=new Scanner(System.in);
	public boolean check_prime() {
		System.out.println("-----------prime number checking------------------");
		System.out.println("Enter no:");
		int no=sc.nextInt();
		int i;
		for(i=2;i<=no;i++)
		{
			if(no%i==0)
			{
				break;
			}
		}
		if(i==no)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		Prime_no pn=new Prime_no();
		System.out.println(pn.check_prime());

	}

}
