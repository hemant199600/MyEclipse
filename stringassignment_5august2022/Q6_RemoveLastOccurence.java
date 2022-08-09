package stringassignment_5august2022;

import java.util.Scanner;

public class Q6_RemoveLastOccurence {

	String s;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter String: ");
		s=sc.nextLine();
	}
	public void remove() {
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[ch.length-1]==ch[i])
			{
				ch[i]=' ';
			}
			
		}
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			System.out.print(ch[i]);
		}
	}
	public static void main(String[] args) {
		Q6_RemoveLastOccurence obj=new Q6_RemoveLastOccurence();
		obj.input();
		obj.remove();
		
	}

}
