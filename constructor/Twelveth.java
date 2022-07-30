package constructor;

import java.util.Scanner;

public class Twelveth {
	int a,b;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter first number: ");
		a=sc.nextInt();
		System.out.println("Enter Second number: ");
		b=sc.nextInt();
	}
	public int add()
	{
		return a+b;
	}
	public int sub()
	{
		return a-b;
	}
	public int mult()
	{
		return a*b;
	}
	public int div()
	{
		return a/b;
	}
	public void menus()
	{
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ch,temp=0;
		char c;
		Twelveth tw=new Twelveth();
		do
		{
			tw.menus();
			System.out.println("Enter your choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				{
					tw.input();
					System.out.println("Addition: "+tw.add()); 
					break;
				}
				case 2:
				{
					tw.input();
					System.out.println("Substraction: "+tw.sub()); 
					break;
				}
				case 3:
				{
					tw.input();
					System.out.println("Multiplication: "+tw.mult()); 
					break;
				}
				case 4:
				{
					tw.input();
					System.out.println("Division: "+tw.div()); 
					break;
				}
				default:
				{
					System.out.println("Enter valid choice....!");
				}
			}
			System.out.println("Do you want to continue: yes/no?");
			c=sc.next().charAt(0);
			if(c=='n'||c=='N')
			{
				temp=1;
				System.out.println("Bye..bye..!");
			}
		}while(temp!=1);
	}
}
