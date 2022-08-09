package mixedAssignment9Aug2022;

import java.util.Scanner;

public class Q5_LoweToUpper {
	String s;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter string: ");
		{
			s=sc.nextLine();
		}
	}
	public void convert()
	{
		String str[]=s.split(" ");
		String []a=null;
		for(int i=0;i<str.length;i++)
		{
			a=str[i].split("");
			String temp="";
			if(Character.isLowerCase(str[i].charAt(0)))
			{
				for(int j=0;j<a.length;j++)
				{
					if(j==0)
					{
						a[j]=a[j].toUpperCase();
						temp+=a[j];
					}
					else
					{
						temp+=a[j];
					}
				}
			str[i]=temp;
		}
			
			
		}
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
	}
	public static void main(String[] args) {
		Q5_LoweToUpper obj=new Q5_LoweToUpper();
		obj.input();
		obj.convert();
		

	}

}
