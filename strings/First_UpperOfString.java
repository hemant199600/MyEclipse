package strings;

import java.util.Scanner;

public class First_UpperOfString {
	String s;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter string: ");
		{
			s=sc.nextLine();
		}
	}
	public void upper()
	{
		String str[]=s.split(" ");
		String s2="";
		for(int i=0;i<str.length;i++)
		{
			String s1=str[i].substring(0, 1).toUpperCase();
			str[i]=s1+str[i].substring(1, str[i].length());
			s2+=str[i]+" ";
			s1="";
		}
		System.out.println("After converting: "+s2);
	}

	public static void main(String[] args) {
		First_UpperOfString obj=new First_UpperOfString();
		obj.input();
		obj.upper();

	}

}
