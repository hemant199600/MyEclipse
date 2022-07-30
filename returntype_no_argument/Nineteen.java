package returntype_no_argument;

import java.util.Scanner;

public class Nineteen {
	Scanner sc=new Scanner(System.in);;
	int a,b;
	public void input()
	{
		System.out.println("Enter first value: ");
		a=sc.nextInt();
		System.out.println("Enter Second value: ");
		b=sc.nextInt();
	}
	public void add()
	{
		this.input();
		System.out.println("Addition :"+(a+b));
	}
	public void sub()
	{
		this.input();
		System.out.println("Substraction :"+(a-b));
	}
	public void mult()
	{
		this.input();
		System.out.println("Multition :"+(a*b));
	}
	public void div()
	{
		this.input();
		System.out.println("Division :"+(a/b));
	}
	public void menus()
	{
		System.out.println("**************Menus**************");
		System.out.println("1.no return type with no argument");
	    System.out.println("2.no return type with argument");
	    System.out.println("3.return type with no argument");
	    System.out.println("4.return type with  argument"); 
	}
	public void menus1()
	{
		System.out.println("**************Menus**************");
		System.out.println("1.Addition");
	    System.out.println("2.Substraction");
	    System.out.println("3.Multiplication");
	    System.out.println("4.Division"); 
	}
	//switch method
	public void switchinter()
	{
		char c;
		int temp=0,ch;
		do {
				this.menus1();
				System.out.println("Enter your choice: ");
				ch=sc.nextInt();
				switch(ch)
				{
					case 1:
					{
						this.add();
						break;
					}
					case 2:
					{
						this.sub();
						break;
					}
					case 3:
					{
						this.mult();
						break;
					}
					case 4:
					{
						this.div();
						break;
					}
				
					default:
					{
						System.out.println("Enter valid choice.....?");
						System.out.println();
						this.menus1();
						break;
					}
				}
				
				
				System.out.println("Do you want to continue with this method....? yes/no ..");
				c=sc.next().charAt(0);
				if(c=='n'||c=='N')
				{
					temp=1;
				}
				
		}while(temp!=1);
	}
	public static void main(String[] args) {
		
		Nineteen n=new Nineteen();
		Scanner sc=new Scanner(System.in);
		char c;
		int temp=0,ch;
		do {
				n.menus();
				System.out.println("Enter your choice: ");
				ch=sc.nextInt();
				switch(ch)
				{
				case 1:
				{
					n.switchinter();
					break;
				}
				case 2:
				{
					n.switchinter();
					break;
				}
				case 3:
				{
					n.switchinter();
					break;
				}
				case 4:
				{
					n.switchinter();
					break;
				}
				
					default:
					{
						System.out.println("Enter valid choice.....?");
						break;
					}
				}
				
				
				System.out.println("Do you want to continue with another methods....? yes/no ..");
				c=sc.next().charAt(0);
				if(c=='n'||c=='N')
				{
					temp=1;
					System.out.println("bye bye....!");
				}
				
		}while(temp!=1);
		
	}

}
