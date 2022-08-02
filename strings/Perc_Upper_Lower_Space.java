package strings;
import java.util.Scanner;

public class Perc_Upper_Lower_Space {

	float sp,u,l;
	public void perc(String s)
	{
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
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
		}
	}
	public void display(String s)
	{
		System.out.println("Entered String                            : "+s);
		System.out.println("Uppercase characters in entered string are: "+(u/s.length()*100)+"%.");
		System.out.println("Lowercase characters in entered string are: "+(l/s.length()*100)+"%.");
		System.out.println("Space characters in entered string are    : "+(sp/s.length()*100)+"%.");

	}
	public static void main(String[] args) {
		Perc_Upper_Lower_Space pr=new Perc_Upper_Lower_Space();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.nextLine();
		pr.perc(str);
		pr.display(str);

	}

}
