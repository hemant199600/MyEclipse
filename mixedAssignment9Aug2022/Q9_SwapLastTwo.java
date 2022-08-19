package mixedAssignment9Aug2022;

import java.util.Scanner;

public class Q9_SwapLastTwo {

	String s;
	Scanner sc=new Scanner(System.in);
	public Q9_SwapLastTwo() {
		System.out.println("Enter first String: ");
		s=sc.nextLine();
	}
	public void swap()
	{
		char ch[]=s.toCharArray();
		char temp=ch[ch.length-1];
		ch[ch.length-1]=ch[ch.length-2];
		ch[ch.length-2]=temp;
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Q9_SwapLastTwo obj=new Q9_SwapLastTwo();
		obj.swap();

	}

}
