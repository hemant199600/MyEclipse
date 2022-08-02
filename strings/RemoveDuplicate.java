package strings;

import java.util.Scanner;

public class RemoveDuplicate {

	public void remove(String s)
	{
		int c=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					c++;
					for(int k=j;k>=1;k--)
					{
						ch[k]=ch[k-1];
						
					}
				}
			}
		}
		for(int i=c;i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
		}
	}
	public void display(char[] ch)
	{
		System.out.print("array is: ");
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		RemoveDuplicate rm=new RemoveDuplicate();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String s1=sc.nextLine();
		rm.display(s1.toCharArray());
		System.out.println("After removing duplicates: ");
		rm.remove(s1);
		
		
	}

}
