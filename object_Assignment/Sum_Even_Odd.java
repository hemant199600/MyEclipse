package object_Assignment;

import java.util.Scanner;

public class Sum_Even_Odd {
	int num;
	Scanner sc;

	public void input() {
		sc = new Scanner(System.in);
		System.out.println("Enter range : ");
		num = sc.nextInt();
	}
	public void sum()
	{
		int os=0,es=0;
		for(int i=num;i!=0;i=i/10)
		{
			int rem=i%10;
			if(rem%2==0)
				es=es+rem;
			else
				os=os+rem;
		}
		System.out.println("Sum of even: "+es);
		System.out.println("Sum of Odd : "+os);
	}

	public static void main(String[] args) {
		Sum_Even_Odd so=new Sum_Even_Odd();
		so.input();
		so.sum();

	}

}
