package _Interface;

import java.util.Scanner;

public class A1 implements First {

	A2 x;
	Scanner sc=new Scanner(System.in);
	int a;
	@Override
	public int input() {
		System.out.println("enter value: ");
		a=sc.nextInt();
		return a;
	}
	@Override
	public void disp(int r) {
		System.out.println("Result: "+r);
		
	}

}
