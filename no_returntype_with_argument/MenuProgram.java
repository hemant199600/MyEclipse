package no_returntype_with_argument;
import java.util.*;
public class MenuProgram {
	Scanner in=new Scanner(System.in);
	
	
	public void input()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("\t\tCALCULATOR\t\t");
		System.out.println("\t\t===========\t\t");
		System.out.println("\t\t+ : ADD\t\t");
		System.out.println("\t\t- : SUB\t\t");
		System.out.println("\t\t* : MULT\t\t");
		System.out.println("\t\t/ : DIV\t\t");
		
		
	}
	public void add()
	{
		int a,b;
		System.out.println("enter the 1st value");
		a=in.nextInt();
		System.out.println("enter the 2nd value");
		b=in.nextInt();
		System.out.println("Addition= "+(a+b));
		
	}
	
	public void sub(int a, int b)
	{	
		
		
		System.out.println("Substraction= "+(a-b));
	}
	
	public int multi()
	{
		int a,b;
		System.out.println("enter the 1st value");
		a=in.nextInt();
		System.out.println("enter the 2nd value");
		b=in.nextInt();
		
		return a*b;		
	}
	
	public int div(int a,int b)
	{
		
		return a/b;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		MenuProgram obj=new MenuProgram();
		Scanner in=new Scanner(System.in);
		char ch;
		int i=1;
		while(i!=0)
		{
			obj.input();
			System.out.print("\n\t\tEnter your choice= ");
			ch=in.next().charAt(0);
			
			switch(ch)
			{
			case '+':
			{
			  obj.add();
			  break;
			}  
			case '-':
			{
				System.out.println("enter the 1st value");
				a=in.nextInt();
				System.out.println("enter the 2nd value");
				b=in.nextInt();
				obj.sub(a,b);
				break;
			}
			case '*':
			{
				int k=obj.multi();
				System.out.println("multiplication result ="+k);
				break;
			}
			case '/':
			{
				System.out.println("enter the 1st value");
				a=in.nextInt();
				System.out.println("enter the 2nd value");
				b=in.nextInt();
				int j=obj.div(a, b);
				System.out.println("division= "+j);
			}
				default:
					System.out.println("Invalid choice");
					break;
			}
		     
			System.out.println("enter your choice");
			 i=in.nextInt();
			 System.out.println("Thank you..                                                                                                                                                                                         ");
				
		}	
				
	}

}
