package stringassignment_5august2022;

import java.util.Scanner;

public class Q5_RemoveFirststOccurence {

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
			if(ch[0]!=ch[i])
			{
				
				System.out.print(ch[i]);
			}
		}
		
	}
	public static void main(String[] args) {
		Q5_RemoveFirststOccurence obj=new Q5_RemoveFirststOccurence();
		obj.input();
		obj.remove();
		
	}

}
