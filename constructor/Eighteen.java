package constructor;

import java.util.Scanner;

public class Eighteen {
	int n;
	Eighteen(int n)
	{
		this.n=n;
	}
	public void palindrome()
	{
		for(int i=10;i<=n;i++)
		{
			int rem=0,rev=0;
			for(int j=i;j!=0;j/=10)
			{
				rem=j%10;
				rev=rev*10+rem;
			}
			if(i==rev)
				System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range: ");
		int r=sc.nextInt();
		Eighteen e=new Eighteen(r);
		System.out.println("Palindrome number upto :"+r);
		e.palindrome();
		
	}

}
