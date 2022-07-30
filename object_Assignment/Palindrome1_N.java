package object_Assignment;

import java.util.Scanner;

public class Palindrome1_N {
	Scanner sc;
	int no;

	public void input() {
		sc = new Scanner(System.in);
		System.out.println("Enter range: ");
		no = sc.nextInt();
	}

	public void palindrome() {
		for(int j=1;j<no;j++)
		{
			int rev = 0, rem, i;
			for (i = j; i != 0; i = i / 10) {
				rem = i % 10;
				rev = rev * 10 + rem;
	
			}
			if (j == rev) {
				System.out.println(j+" ");
			} 
		}
	}

	public static void main(String[] args) {
		Palindrome1_N pl=new Palindrome1_N();
		pl.input();
		pl.palindrome();

	}

}
