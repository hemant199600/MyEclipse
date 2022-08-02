package string_Assignment2August;

import java.util.Scanner;

public class Q3_Occurence_Word {

	Scanner sc=new Scanner(System.in);
	public int occur()
	{
		int count=0;
		System.out.println("Enter String");
		String s=sc.nextLine();
		System.out.println("Entered string :"+s);
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			if(s1[0].equals(s1[i]))
			{
				count++;
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		
		Q3_Occurence_Word obj=new Q3_Occurence_Word();
		System.out.println("First word is occured "+(obj.occur())+" times in entered Strings.");
	}

}

