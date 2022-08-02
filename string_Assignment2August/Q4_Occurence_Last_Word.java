package string_Assignment2August;

import java.util.Scanner;

public class Q4_Occurence_Last_Word {

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
			if(s1[s1.length-1].equals(s1[i]))
			{
				count++;
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		
		Q4_Occurence_Last_Word obj=new Q4_Occurence_Last_Word();
		System.out.println("Last word is occured "+(obj.occur())+" times in entered Strings.");
	}

}


