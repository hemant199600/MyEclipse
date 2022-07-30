package methods;

import java.util.Scanner;

public class Sample_nrwa {
	int a,b;
	public void copy(int q,int r)
	{
		a=q;
		b=r;
	}
	public void sum()
	{
		System.out.println("Addition: "+(a+b));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value: ");
		int a=sc.nextInt();
		System.out.println("Enter Second value");
		int b=sc.nextInt();
		Sample_nrwa sa=new Sample_nrwa();
		sa.copy(a, b);
		sa.sum();
	}

}
