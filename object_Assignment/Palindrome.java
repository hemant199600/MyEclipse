package object_Assignment;

import java.util.Scanner;

public class Palindrome {
	Scanner sc;
	int no;

	public void input() {
		sc = new Scanner(System.in);
		System.out.println("Enter no: ");
		no = sc.nextInt();
	}

	public void palindrome() {
		int rev=0,rem,i;
		for (i = no; i!=0; i=i/10) {
			rem=i%10;
			rev=rev*10+rem;
			
		}
		if (no == rev) {
			System.out.println("palindrome no");
		} else
			System.out.println("Not palindrome no");
	}

	public static void main(String[] args) {
		Palindrome p=new Palindrome();
		p.input();
		p.palindrome();

	}

}
