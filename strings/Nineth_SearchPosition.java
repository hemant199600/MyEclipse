package strings;

import java.util.Scanner;

public class Nineth_SearchPosition {

	public void search(String s,char c)
	{
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
			{
				System.out.println("Element found at "+(i+1)+" position.");
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Nineth_SearchPosition s=new Nineth_SearchPosition();
		System.out.print("Enter String: ");
		String input=sc.nextLine();
		System.out.print("Enter Character for search: ");
		char c=sc.next().charAt(0);
		s.search(input, c);
		
	}

}
