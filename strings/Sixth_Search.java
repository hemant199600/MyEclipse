package strings;

import java.util.Scanner;

public class Sixth_Search {

	public boolean search(String s,char c)
	{
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
			{
				return true;
			}
			
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Sixth_Search s=new Sixth_Search();
		System.out.print("Enter String: ");
		String input=sc.nextLine();
		System.out.print("Enter Character for search: ");
		char c=sc.next().charAt(0);
		if(s.search(input,c))
		{
			System.out.println("Element Found.");
		}
		else
			System.out.println("Element not Found.");
		
	}

}
