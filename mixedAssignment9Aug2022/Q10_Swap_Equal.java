package mixedAssignment9Aug2022;

import java.util.Scanner;

public class Q10_Swap_Equal {


	String s;
	Scanner sc=new Scanner(System.in);
	public Q10_Swap_Equal() {
		System.out.println("Enter first String: ");
		s=sc.nextLine();
	}
	public String check()
	{
		String str="";
		char ch[]=s.toCharArray();
		if(ch[0]==ch[ch.length-1])
		{
			for(int i=1;i<ch.length-1;i++)
			{
				str+=ch[i];
			}
			return str;
		}
		else
		{
			return s;
		}
	}
	public static void main(String[] args) {
		Q10_Swap_Equal obj=new Q10_Swap_Equal();
		System.out.println("After checking:"+obj.check());
	}

}
