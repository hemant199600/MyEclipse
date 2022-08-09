package strings;

import java.util.Scanner;

public class Ly_Ing {

	Scanner sc=new Scanner(System.in);
	public String  input()
	{
		System.out.println("Enter String:");
		String str=sc.nextLine();
		return str;
	}
	public String check(String s)
	{
		String str[]=s.split("");
		String temp="";
		if(s.endsWith("ing"))
		{
			temp=s.replace(s.substring(str.length-3), "ly");
		}
		else
		{
			temp=s.concat("ing");
		}
		return temp; 
	}
	public static void main(String[] args) {
		Ly_Ing obj=new Ly_Ing();
		System.out.println("after Checking :"+(obj.check(obj.input())));
		System.out.println();
		

	}

}
