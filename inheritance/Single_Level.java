package inheritance;

import java.util.Scanner;

class Parent
{
	Scanner sc=new Scanner(System.in);
	String name;
	int id;
		public void input()
		{
			System.out.print("Enter your name: ");
			name=sc.nextLine();
			System.out.println();
		}
}
class Child extends Parent
{
	public void accessParent()
	{
		System.out.print("Enter id: ");
		id=sc.nextInt();
		System.out.println();
		System.out.println("ID   :"+id);
		System.out.println("NAME :"+name);
	}
	
}

public class Single_Level {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.id=99;
		c.input();
		c.accessParent();
		

	}

}

