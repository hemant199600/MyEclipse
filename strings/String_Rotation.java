package strings;

import java.util.Scanner;

public class String_Rotation {
	String s;
	String_Rotation(String s)
	{
		this.s=s;
	}
	public String[] rotateStringClock(int r)
	{
		String s1[]=s.split(" ");
		for(int i=0;i<r;i++)
		{
			String temp=s1[0];
			int j;
			for(j=0;j<s1.length-1;j++)
			{
				s1[j]=s1[j+1];
			}
			s1[j]=temp;
		}
		return s1;
	}
	public String[] rotateStringAntiClock(int r)
	{
		String s1[]=s.split(" ");
		for(int i=0;i<r;i++)
		{
			String temp=s1[s1.length-1];
			int j;
			for(j=s1.length-1;j>0;j--)
			{
				s1[j]=s1[j-1];
			}
			s1[0]=temp;
		}
		return s1;
	}
	public void display(String s[])
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String s=sc.nextLine();
		String_Rotation sr=new String_Rotation(s);
		System.out.println("Enter how much word do u want to rotate: ");
		int t=sc.nextInt();
		System.out.println("----ClockWise----");
		sr.display(sr.rotateStringClock(t));
		System.out.println("---AntiClockWise---");
		sr.display(sr.rotateStringAntiClock(t));
	}

}
