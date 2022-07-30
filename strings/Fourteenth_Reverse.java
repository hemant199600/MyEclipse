package strings;

import java.util.Scanner;

public class Fourteenth_Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String    : ");
		String s=sc.nextLine();
		System.out.print("Entered String  : "+s);
		System.out.print("\nReverse String  : ");
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}

}
