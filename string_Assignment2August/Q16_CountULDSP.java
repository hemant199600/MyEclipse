package string_Assignment2August;

import java.util.Scanner;

public class Q16_CountULDSP {

	float sp,u,l,spe;
	public void perc(String s)
	{
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=1&&ch[i]<=9||ch[i]==0)
			{
				sp++;
			}
			else if(ch[i]>='A'&&ch[i]<='Z')
			{
				u++;
			}
			else if(ch[i]>='a'&&ch[i]<='z')
			{
				l++;
			}
			else if(ch[i]>='!'&&ch[i]<=')')
			{
				
				spe++;
			}
		}
	}
	public void display(String s)
	{
		System.out.println("Entered String                            : "+s);
		System.out.println("Uppercase characters in entered string are: "+(u/s.length()*100)+"%.");
		System.out.println("Lowercase characters in entered string are: "+(l/s.length()*100)+"%.");
		System.out.println("Digits in entered string are   			  : "+(sp/s.length()*100)+"%.");
		System.out.println("Special character in entered string are   : "+(spe/s.length()*100)+"%.");

	}
	public static void main(String[] args) {
		Q16_CountULDSP pr=new Q16_CountULDSP();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.nextLine();
		pr.perc(str);
		pr.display(str);

	}

}

