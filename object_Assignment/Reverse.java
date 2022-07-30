package object_Assignment;

import java.util.Scanner;

public class Reverse {
	int num;
	Scanner sc;

	public void input() {
		sc = new Scanner(System.in);
		System.out.println("Enter range : ");
		num = sc.nextInt();
	}
	public void reverse()
	{
		int rev=0;
		for(int i=num;i!=0;i=i/10)
		{
			int rem=i%10;
			rev=rev*10+rem;
		}
		System.out.println("Reverse: "+rev);
	}

	public static void main(String[] args) {
		Reverse r=new Reverse();
		r.input();
		r.reverse();

	}

}
