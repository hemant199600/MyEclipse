package strings;

import java.util.Scanner;

public class String_Insertion {

	String s;
	static Scanner sc=new Scanner(System.in);
	public String[] insert(String s,String newString)
	{
		String s1[]=s.split(" ");
		System.out.println("Enter position: ");
		int pos=sc.nextInt();
		String []s2=new String[s1.length+1];
		for(int i=0;i<s1.length;i++)
		{
			s2[i]=s1[i];
		}
		for(int i=s2.length-1;i>pos-1;i--)
		{
			s2[i]=s2[i-1];
		}
		s2[pos-1]=newString;
		return s2;
	}
	public void display(String []s,int n)
	{
		for(int i=0;i<n;i++)
		{
				System.out.print(s[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		System.out.println("Enter String :");
		String str=sc.nextLine();
		String_Insertion pr=new String_Insertion();
		System.out.println("---------Entered String----------");
		String k[]=str.split(" ");
		pr.display(k,k.length);
		System.out.println("Enter String for insert");
		String ns=sc.nextLine();
		System.out.println("------------After insertion------------");
		String l[]=pr.insert(str, ns);
		pr.display(l,l.length);
	}

}
