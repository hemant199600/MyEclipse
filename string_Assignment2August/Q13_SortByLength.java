package string_Assignment2August;
import java.util.Scanner;

public class Q13_SortByLength {

	String s;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter String: ");
		s=sc.nextLine();
		System.out.println("Entered String: "+s);
	}
	public String [] asc()
	{
		
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].length()>s1[j].length())
				{
					String temp=s1[j];
					s1[j]=s1[i];
					s1[i]=temp;
				}
			}
		}
		return s1;
	}
	public String [] desc()
	{
		
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].length()<s1[j].length())
				{
					String temp=s1[j];
					s1[j]=s1[i];
					s1[i]=temp;
				}
			}
		}
		return s1;
	}
	public void display(String[] s1)
	{
		for(int i=0;i<s1.length;i++)
		{
			System.out.print(s1[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Q13_SortByLength obj=new Q13_SortByLength();
		obj.input();
		String t[]=obj.asc();
		System.out.println("Ascending: ");
		obj.display(t);
		System.out.println("Descending:  ");
		obj.display(obj.desc());
	}

}
