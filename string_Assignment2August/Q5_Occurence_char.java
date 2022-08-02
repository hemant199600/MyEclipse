package string_Assignment2August;

import java.util.Scanner;

public class Q5_Occurence_char {

	Scanner sc=new Scanner(System.in);
	public int occur()
	{
		int count=0;
		System.out.println("Enter String");
		String s=sc.nextLine();
		System.out.println("Entered string :"+s+".");
		char[] s1=s.toCharArray();
		for(int i=0;i<s1.length;i++)
		{
			if(s1[0]==(s1[i]))
			{
				count++;
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		
		Q5_Occurence_char obj=new Q5_Occurence_char();
		System.out.println("First char is occured "+(obj.occur())+" times in entered Strings.");
	}

}


