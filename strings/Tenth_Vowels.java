package strings;

import java.util.Scanner;

public class Tenth_Vowels {

	public boolean findCount(char c)
	{
		if(c=='i'||c=='I'||c=='a'||c=='A'||c=='e'||c=='E'||c=='o'||c=='O'||c=='u'||c=='U')
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Tenth_Vowels tn=new Tenth_Vowels();
		System.out.print("Enter String: ");
		String s=sc.nextLine();
		int v=0,c=0;
		for(int i=0;i<s.length();i++)
		{
			if(tn.findCount(s.charAt(i)))
			{
				v++;
				System.out.println(s.charAt(i));
			}
			else
			{
				c++;
			}
		}
		System.out.println("number of Vovel: "+v);		
		System.out.println("number of Consonents: "+c);		
		
	}

}
