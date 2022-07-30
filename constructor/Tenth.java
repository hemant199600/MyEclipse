package constructor;

import java.util.Scanner;

public class Tenth {
	double rate,amt,temp=1,si,t=10,tp;
	Tenth(double r,double a)
	{
		rate=r;
		amt=a;
	}
	
	public void calculate()
	{
		System.out.println("\tYear\tPrinciple Amount\tRate\tSimpleInterest\tTotal Pay");
		while(temp<=t)
		{
			si=(temp*rate*amt)/100;
			tp=si+amt;
			System.out.println("\t"+temp+"\t       "+amt+"\t\t "+rate+"\t    "+si+"\t"+tp);
			temp++;
		}
			System.out.println("\t\t\t\t\t------------------------");
			System.out.println("\t\t\t\t\tTotal Pay = "+(tp));
			
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("*************** Simple interest Calculator *****************");
		System.out.println("Enter Amount: ");
		double amount=sc.nextInt();
		System.out.println("Enter Rate: ");
		double rate=sc.nextInt();
		Tenth t=new Tenth(rate, amount);
		t.calculate();
		
	}

}
