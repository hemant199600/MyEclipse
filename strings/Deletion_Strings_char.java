package strings;

import java.util.Scanner;

public class Deletion_Strings_char {

	Scanner sc=new Scanner(System.in);
	public void deletionString(String s)
	{
		System.out.println("-------Given String---------");
		System.out.println(s);
		System.out.println("Enter string for deletion:");
		String sd=sc.nextLine();
		String []s1=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].equals(sd))
			{
				for(int j=i;j<(s1.length-1);j++)
				{
					s1[j]=s1[j+1];
				}
			}
		}
		System.out.println("---------After deletion----------");
		for(int i=0;i<s1.length-1;i++)
		{
			System.out.print(s1[i]+" ");
		}
		System.out.println();
	}
	public void deletionChar(String s)
	{
		System.out.println("-------Given String---------");
		System.out.println(s);
		System.out.println("Enter char for deletion:");
		char sd=sc.next().charAt(0);
		char []s1=s.toCharArray();
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]==(sd))
			{
				for(int j=i;j<(s1.length-1);j++)
				{
					s1[j]=s1[j+1];
				}
			}
		}
		System.out.println("---------After deletion----------");
		for(int i=0;i<s1.length-1;i++)
		{
			System.out.print(s1[i]+"");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Deletion_Strings_char obj=new Deletion_Strings_char();
		System.out.println("*********STRING************");
		obj.deletionString("TODO Auto-generated method stub");
		System.out.println();
		System.out.println("*********CHAR*************");
		obj.deletionChar("Auto-generated");

	}
	
}
