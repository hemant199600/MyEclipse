package strings;

import java.util.Scanner;

public class Seventh_EvenPosition {

	public void  search(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			if(i%2==1)
			{
				System.out.print(s.charAt(i));
			}
			
		}

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Seventh_EvenPosition s=new Seventh_EvenPosition();
		System.out.print("Enter String: ");
		String input=sc.nextLine();
		System.out.print("Even position Character in Entered String: ");
		s.search(input);
		
		
	}

}
