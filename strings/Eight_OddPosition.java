package strings;

import java.util.Scanner;

public class Eight_OddPosition {

	public void  search(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				System.out.print(s.charAt(i)+" ");
			}
			
		}

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Eight_OddPosition s=new Eight_OddPosition();
		System.out.print("Enter String: ");
		String input=sc.nextLine();
		System.out.print("Odd position Character in Entered String: ");
		s.search(input);
		
		
	}

}
