package strings;

import java.util.Scanner;

public class Twelveth_EvenOdd {
	
	public void  evenSearch(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			if(i%2==1)
			{
				System.out.print(s.charAt(i));
			}
			
		}
		System.out.println();

	}
	public void  oddSearch(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				System.out.print(s.charAt(i));
			}
			
		}
		System.out.println();

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Twelveth_EvenOdd tw=new Twelveth_EvenOdd();
		System.out.println("Enter String: ");
		String s=sc.nextLine();
		System.out.print("Character at even positon: ");
		tw.evenSearch(s);
		System.out.print("Character at odd positon: ");
		tw.oddSearch(s);
	}

}
