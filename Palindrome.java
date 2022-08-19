import java.util.Scanner;

public class Palindrome {

	Scanner sc=new Scanner(System.in);
	public int  input()
	{
		System.out.println("Enter number: ");
		return sc.nextInt();
	}
	public boolean palindrome(int n) {
		int t=n;
		int r=0,rv=0;
		for(;n!=0;n/=10)
		{
			r=n%10;
			rv=(rv*10)+r;
		}
		if(t==rv)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		
		Palindrome obj=new Palindrome();
		System.out.println(obj.palindrome(obj.input()));
	}

}
