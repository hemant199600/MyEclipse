package stringassignment_5august2022;

import java.util.Scanner;

public class Q2_HighestFreqchar {

	String s;
	int lock=-1;
	int temp[];
	int chara;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter String: ");
		s=sc.nextLine();
	}
	public void occur()
	{
		int c=0;
		String a[]=s.split("");
		temp=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			c=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					temp[j]=lock;
					c++;
				}
			}
			if(temp[i]!=lock)
				temp[i]=c;
		}
		
		int max=temp[0];
		for(int i=0;i<temp.length;i++)
		{
			if(temp[i]>max)
			{
				max=temp[i];
				chara=i;
			}
		}
		System.out.println("Most Repeated character is: "+a[chara]);
	}
	public static void main(String[] args) {
		
		Q2_HighestFreqchar obj=new Q2_HighestFreqchar();
		obj.input();
		obj.occur();
	}

}
