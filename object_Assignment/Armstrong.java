package object_Assignment;

import java.util.Scanner;

public class Armstrong {
	Scanner sc;
	int no;

	public void input() {
		sc = new Scanner(System.in);
		System.out.println("Enter no: ");
		no = sc.nextInt();
	}

	public void armstrong() {
		int arm=0,rem,i;
		for (i = no; i!=0; i=i/10) {
			rem=i%10;
			arm=arm+(rem*rem*rem);
			
		}
		if (no == arm) {
			System.out.println("Armstrong no");
		} else
		{
			System.out.println("Not an Armstrong no");
		}
	}

	public static void main(String[] args) {
		Armstrong a=new Armstrong();
		a.input();
		a.armstrong();

	}

}
