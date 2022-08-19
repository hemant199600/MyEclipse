package mixedAssignment9Aug2022;

import java.util.Arrays;
import java.util.Scanner;

public class Q7_Anagram {

	String s1;
	String s2;
	Scanner sc=new Scanner(System.in);
	
	public Q7_Anagram() {
		System.out.println("Enter first String: ");
		s1=sc.nextLine();
		System.out.println("Enter Second String:");
		s2=sc.nextLine();
	}
	public void anagram()
	{
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		if(s1.length()!=s2.length())
		{
			System.out.println("Entered String are not an angaram: ");
		}
		else
		{
			Arrays.sort(a);
			Arrays.sort(b);
			if(Arrays.equals(a, b)==true)
			{
				System.out.println("Entered Strings are anagram.");
			}
			else
			{
				System.out.println("Entered Strings are not an anagram.");
			}
		}
	}

	public static void main(String[] args) {
		
		Q7_Anagram obj=new Q7_Anagram();
		obj.anagram();
	}

}
