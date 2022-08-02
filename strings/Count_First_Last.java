package strings;
import java.util.Scanner;

public class Count_First_Last {

	public void find(String s)
	{
		int f=0,l=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[0]==ch[i])
			{
				f++;
			}
			if(ch[ch.length-1]==ch[i])
			{
				l++;
			}
		}
		System.out.println("First character occur "+f+" times.");
		System.out.println("Last character occur "+l+" times.");		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Count_First_Last obj=new Count_First_Last();
		System.out.println("Enter String:");
		String str=sc.nextLine();
		obj.find(str);

	}

}
