package inheritance;

import java.util.Scanner;

class Operations
{
	int a,b;
	Scanner sc;
	public  Operations()
	{
		
		System.out.println("Enter first and Second Value:");
		sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
	}
}
class Arithmatic extends Operations
{
	public Arithmatic(String ch)
	{
		super();
		switch(ch)
		{
			case "+":
			{
				System.out.println("Addition: "+(a+b));
				break;
			}
			case "-":
			{
				System.out.println("Substraction: "+(a-b));
				break;
			}
			case "*":
			{
				System.out.println("Multiplication: "+(a*b));
				break;
			}
			case "/":
			{
				System.out.println("Division: "+(a/b));
				break;
			}
		
			default:
			{
				System.out.println("Enter valid choice.......!");
				break;
			}
		}
	}
}
class Basic extends Arithmatic
{
	public Basic(String op)
	{
		super(op);
	}
}
public class MultiLevel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Arithmatic operation sign(+ - * /) to perform task :");
		String op=sc.nextLine();
		Basic b=new Basic(op);

	}

}
