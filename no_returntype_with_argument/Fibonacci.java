package no_returntype_with_argument;
import java.util.*;
public class Fibonacci {
	int a=0,b=1,c,i;
	
	public void logic(int num)
	{
		for(i=0; i<num; i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci obj=new Fibonacci();
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		int num=in.nextInt();
		obj.logic(num);
		
		

	}

}
