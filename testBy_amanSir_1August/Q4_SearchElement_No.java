package testBy_amanSir_1August;

import java.util.Scanner;

public class Q4_SearchElement_No {

	Scanner sc=new Scanner(System.in);
	public String input()
	{
		System.out.println("Enter String : ");
		String s=sc.nextLine();
		return s;
	}
	public void search(String s,char ch)
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
			{
				System.out.println(s.charAt(i)+"\t"+(i+1));
			}
		}
	}
	public static void main(String[] args) {
		Q4_SearchElement_No obj=new Q4_SearchElement_No();
		String s=obj.input();
		System.out.println("Enter character  for search: ");
		char ch=obj.sc.next().charAt(0);
		System.out.println("Element\tNo");
		obj.search(s, ch);

	}

}
