package strings;

import java.util.Scanner;

public class Palindrome {

	String s;
	String rev;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter the string: ");
		s=sc.nextLine();
		s=s.toLowerCase();
	}
	public void check_pali()
	{
		rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		if(rev.compareTo(s)==0)//(rev.equals(s))
		{
			System.out.println("String is Palindrome: "+rev);
		}
		else
		{
			System.out.println("String is not palindrome: "+rev);
		}
	}
	public static void main(String[] args) {
		Palindrome p=new Palindrome();
		p.input();
		p.check_pali();

	}

}
