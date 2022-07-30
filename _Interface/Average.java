package _Interface;

import java.util.Scanner;

interface Average_
{
	public void calculate();
	public void print();
}
public class Average implements Average_{
	static Scanner sc= new Scanner(System.in);
	int s=0;
	public static void main(String[] args) {
		Average a=new Average();
		a.calculate();
		a.print();

	}

	@Override
	public void calculate() {
		System.out.println("Enter Three numbers: ");
		
		for(int i=1;i<=3;i++)
		{
			s+=sc.nextInt();
		}
		
	}

	@Override
	public void print() {
		System.out.println("Average of Three numbers: "+(s/3));
		
	}

}
