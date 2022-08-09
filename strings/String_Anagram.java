package strings;

import java.util.Arrays;
import java.util.Scanner;

public class String_Anagram {
	
	Scanner sc=new Scanner(System.in);
	String s1,s2;
	public void anagram()
	{
		if(s1.length()!=s2.length())
		{
			System.out.println("Strings is not an Anagram");
		}
		else
		{
			s1=s1.toLowerCase();
			s2=s2.toUpperCase();
			char a[]=s1.toCharArray();
			char b[]=s2.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			if(Arrays.equals(a, b)==true)
			{
				System.out.println("Strings Are an Anagram.");
				
			}
			else
			{
				System.out.println("Strings are not an Anagram");
			}
		}
	}
	public void input()
	{
		System.out.println("Enter first strings: ");
		s1=sc.nextLine();
		System.out.println("Enter Second strings: ");
		s2=sc.nextLine();
	}
	public static void main(String[] args) {
		
		String_Anagram st=new String_Anagram();
		st.input();
		st.anagram();
	}

}
