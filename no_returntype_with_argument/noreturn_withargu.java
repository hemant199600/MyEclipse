package no_returntype_with_argument;
import java.util.Scanner;

public class noreturn_withargu {
	int a,b,c;
	
	public void copy(int x,int y)
	{
		a=x;
		b=y;
		c=a+b;
	}
	
	public void disp()
	{
		System.out.println("the sum of integers= "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		noreturn_withargu obj=new noreturn_withargu();
		Scanner in=new Scanner(System.in);
		System.out.println("enter the 1st value");
		int a=in.nextInt();
		System.out.println("enter the 2nd value");
		int b=in.nextInt();
		
		obj.copy(a,b);
		obj.disp();

	}

}
