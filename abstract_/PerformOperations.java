package abstract_;

import java.util.Scanner;

public class PerformOperations extends Arithmatic_Operations
{

	static Scanner sc=new Scanner(System.in);
	
	public void add(int a,int b)
	{
		System.out.println("\tAddition :"+(a+b));
	}
	public void sub(int a,int b)
	{
		System.out.println("\tSubstraction :"+(a-b));
	}
	public void mult(int a,int b)
	{
		System.out.println("\tMultiplication :"+(a*b));
	}
	public void div(int a,int b)
	{
		System.out.println("\tDivision :"+(a/b));
	}
	public void menus()
	{
		System.out.println("\t************Menus************");
		System.out.println("\t1.Addition");
		System.out.println("\t2.Substraction");
		System.out.println("\t3.Multiplication");
		System.out.println("\t4.Division\n");			
	}
	public int input()
	{
		System.out.print("\tEnter value : ");
		int a=sc.nextInt();
		return a;
	}
}
