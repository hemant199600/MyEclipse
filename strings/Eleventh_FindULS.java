package strings;

import java.util.Scanner;

public class Eleventh_FindULS {

	int up=0,lw=0,sp=0;
	public void  findCount(char ch)
	{	
		if(ch>='A' && ch<='Z'){
		    up++;
		}
		else if(ch>='a' && ch<='z'){
		    lw++;
		}
		else if(ch==' ')
		{
			sp++;
		}
	}
	public void display()
	{
		System.out.println("Count of Uppercase: "+up++);
		System.out.println("Count of Lowercase: "+lw++);
		System.out.println("Count of Spaces   : "+sp++);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Eleventh_FindULS tn=new Eleventh_FindULS();
		System.out.print("Enter String: ");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			tn.findCount(s.charAt(i));
		}
		tn.display();
		
	}

}

