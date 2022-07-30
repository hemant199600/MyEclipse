package constructor;

import java.util.Scanner;

public class Eleventh {
	Scanner sc=new Scanner(System.in);
	int sum;
	Eleventh()
	{
		int n=1;
		for(;n!=0;)
		{
			n=sc.nextInt();
			sum=sum+n;
		}
	}
	public void display()
	{
		System.out.println("Sum of Entered number: "+sum);
	}
	
	public static void main(String args[])
	{
		System.out.println("******* Entered numbers *********");
		System.out.println("Note-> [Enter 0 for Stop the inputting.]");
		Eleventh e=new Eleventh();
		e.display();
		
	}
}
