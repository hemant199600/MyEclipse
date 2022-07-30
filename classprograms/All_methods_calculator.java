package classprograms;

import java.util.Scanner;

public class All_methods_calculator {
	int a,b;
	Scanner sc=new Scanner(System.in);
	
	public int input()
	{
		int p=sc.nextInt();
		return p;
	}
	
	public void add()
	{
		System.out.println("Enter first number: ");
		a=sc.nextInt();
		System.out.println("Enter Second number: ");
		b=sc.nextInt();
		System.out.println("Addition: "+(a+b));
	}
	
	
	public int sub(int x,int y)
	{
		return x*y;
	}
	
	public void mult(int x,int y)
	{
		System.out.println("Multiplication: "+(x*y));
	}
	
	
	public int div()
	{
		System.out.println("Enter first number: ");
		int l=sc.nextInt();
		System.out.println("Enter Second number: ");
		int m=sc.nextInt();
		return l/m;
	}
	public void menus()
	{
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
	}
	
	public static void main(String[] args) {
		All_methods_calculator al=new All_methods_calculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("*********Calculator***********");
		int ch,temp=0;
		char uc;
		do
		{
			al.menus();
			System.out.println("Enter your choice: ");
			ch=al.input();
			switch(ch)
			{
				case 1:
				{
					al.add();
					break;
				}
				case 2:
				{
					System.out.println("Enter first number");
					int a=al.input();
					System.out.println("Enter Second number");
					int b=al.input();
					System.out.println("Substraction: "+al.sub(a,b));
					break;
				}
				case 3:
				{
					System.out.println("Enter first number");
					int a=al.input();
					System.out.println("Enter Second number");
					int b=al.input();
					al.mult(a, b);
					break;
				}
				case 4:
				{
					System.out.println("Division: "+al.div());
					break;
				}
			
				default:
				{
					System.out.println("--------Invalid choice----------");
					break;
				}
			}
			System.out.println("Do you want to continue..y/n");
			uc=sc.next().charAt(0);
			if(uc=='n'||uc=='N')
			{
				temp=1;
				System.out.println("Bye Bye.....See you Again..!");
			}
		}while(temp!=1);
	}

}
