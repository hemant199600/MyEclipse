package testBy_amanSir_1August;

import java.util.Scanner;

public class Q1_Search {

	public boolean search(String s,char ch)
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
			{
				return true;
			}
			
		}
		return false;
	}
	public static void main(String[] args) {
		
		System.out.println("Enter String: ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Q1_Search obj=new Q1_Search();
		System.out.println("Enter Character to search: ");
		char ch=sc.next().charAt(0);
		if(obj.search(s, ch))
		{
			System.out.println("Element is present.");
		}
		else
		{
			System.out.println("Element is not present.");
		}
	}

}
