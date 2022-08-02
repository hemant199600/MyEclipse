package string_Assignment2August;

import java.util.Scanner;

public class Q1_ReplaceWord {

	Scanner sc=new Scanner(System.in);
	String b,a;
	public void replace(String s)
	{
		System.out.println("Enter new word: ");
		b=sc.nextLine();
		System.out.println("Enter old word : ");
		a=sc.nextLine();
		System.out.println("After Replacing: "+(s.replace(a, b)));
		
	}
	public static void main(String[] args) {
		Q1_ReplaceWord rc=new Q1_ReplaceWord();
		System.out.println("Enter String:");
		String str=rc.sc.nextLine();
		rc.replace(str);
	}

}

