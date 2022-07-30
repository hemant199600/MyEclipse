package no_returntype_with_argument;
import java.util.*;
public class Reverse {
	int i,rem,rev=0,p;
	
	
	public void logic(int num)
	{
		for(i=num; i!=0; i=i/10)
		{
			rem=i%10;
			rev=rev*10+rem;
		}
		System.out.print("The reverse number is= "+rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse obj=new Reverse();
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		int  num=in.nextInt();
		
		obj.logic(num);
		
		

	}

}
