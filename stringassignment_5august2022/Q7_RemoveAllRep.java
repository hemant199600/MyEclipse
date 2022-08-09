package stringassignment_5august2022;

import java.util.Scanner;

public class Q7_RemoveAllRep {

	String s;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter String: ");
		s=sc.nextLine();
	}
	public void remove()
	{
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]=' ';
				}
			}
		}
		System.out.print("After removing repeated element from string: ");
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				System.out.print(ch[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Q7_RemoveAllRep obj=new Q7_RemoveAllRep();
		obj.input();
		obj.remove();

	}

}
