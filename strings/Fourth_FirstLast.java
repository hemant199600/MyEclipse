package strings;

import java.util.Scanner;

public class Fourth_FirstLast {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Input: ");
		String input=sc.nextLine();
		System.out.println("Your inputted Strings First Char : "+input.charAt(0));
		System.out.println("Your inputted Strings Last  Char : "+input.charAt(input.length()-1));
	}

}
