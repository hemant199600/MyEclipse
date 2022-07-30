package no_returntype_with_argument;import java.util.*;
public class Factorial {
	int i,fact=1;
	
	public void logic(int num)
	{
		for(i=1; i<=num; i++)
		fact=fact*i;
	}

	public void disp()
	{
		System.out.println("the factorial is= "+fact);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Factorial obj=new Factorial();
      Scanner in=new Scanner(System.in);
      System.out.println("enter the number");
       int num=in.nextInt();
       obj.logic(num);
       obj.disp();
       
      
      
      
	}

}
