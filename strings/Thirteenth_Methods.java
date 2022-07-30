package strings;

import java.util.Scanner;

class Overloading
{
	public void disp()
	{
		System.out.print("Hello! ");
	}
	public void disp(String name)
	{
		System.out.println(name);
	}
	
}
class Overriding extends Overloading
{
	public void disp()
	{
		super.disp();
	}
}
public class Thirteenth_Methods {

	public static void main(String[] args) {
		Overriding o=new Overriding();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String s=sc.nextLine();
		o.disp();
		o.disp(s);

	}

}
