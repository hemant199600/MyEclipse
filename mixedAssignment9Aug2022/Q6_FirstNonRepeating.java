package mixedAssignment9Aug2022;

import java.util.Scanner;

public class Q6_FirstNonRepeating {

	String s;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter string: ");
		{
			s=sc.nextLine();
		}
	}
	public void find()
	{
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int j;
			for(j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j]&&i!=j)
				{
					break;
				}
			}
			if(j==ch.length)
			{
				System.out.println(ch[i]);
				break;
			}
		}
	}
	public static void main(String[] args) {
		
		Q6_FirstNonRepeating obj=new Q6_FirstNonRepeating();
		obj.input();
		obj.find();
	}

}
