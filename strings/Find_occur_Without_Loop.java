package strings;

import java.util.Scanner;

public class Find_occur_Without_Loop {

	Scanner sc=new Scanner(System.in);
	public int print(String s, String ch)
	{
		String s1=s.replace(ch,"");
		return (s.length()-s1.length());
	}
	public static void main(String[] args) {
		
		Find_occur_Without_Loop lp=new Find_occur_Without_Loop();
		System.out.println("Enter String:");
		String s=lp.sc.nextLine();
		System.out.println("Enter char for occur: ");
		String o=lp.sc.nextLine();
		System.out.println("Your char occured in:"+lp.print(s,o)+" times.");
	}

}
