package mixedAssignment9Aug2022;

import java.util.Scanner;

public class Q11_PercULDS {
	float u,l,sp,d,w=1;
	
	public void perc(String s)
	{
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				w++;
			}
			else if(ch[i]>='A'&&ch[i]<='Z')
			{
				u++;
			}
			else if(ch[i]>='a'&&ch[i]<='z')
			{
				l++;
			}
			else if(ch[i]>='!'&&ch[i]<='/')
			{
				sp++;
			}
			else if(ch[i]>=0&&ch[i]<=9)
			{
				d++;
			}
		}
	}
	public void display(String s)
	{
		System.out.println("Entered String                            : "+s);
		System.out.println("Uppercase characters in entered string are: "+(int)(u/s.length()*100)+"%.");
		System.out.println("Lowercase characters in entered string are: "+(int)(l/s.length()*100)+"%.");
		System.out.println("Special characters in entered string are  : "+(int)(sp/s.length()*100)+"%.");
		System.out.println("digits characters in entered string are   : "+(int)(d/s.length()*100)+"%.");
		System.out.println("Words in entered string are    	          : "+(int)(w/s.length()*100)+"%.");

	}
	public static void main(String[] args) {
		Q11_PercULDS pr=new Q11_PercULDS();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.nextLine();
		pr.perc(str);
		pr.display(str);

	}
}
