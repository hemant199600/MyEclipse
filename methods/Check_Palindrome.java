package methods;

import java.util.Scanner;

public class Check_Palindrome {
Scanner sc=new Scanner(System.in);
int no;
	public void input()
	{
		System.out.println("-----------palindrome number checking------------------");
		System.out.println("Enter number: ");
		no=sc.nextInt();
	}
	
	public boolean check_palindrome() {
		int rev=0;
		for(int i=no;i!=0;i/=10)
		{
			int rem=i%10;
			rev=rev*10+rem;
			
		}
		if(rev==no)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		Check_Palindrome pn=new Check_Palindrome();
		pn.input();
		if(pn.check_palindrome())
		{
		  System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
