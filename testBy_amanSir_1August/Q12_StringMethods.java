package testBy_amanSir_1August;

import java.util.Scanner;

public class Q12_StringMethods {

	Scanner sc=new Scanner(System.in);
	String s1, s2;
	int index;
	public void input()
	{
		System.out.println("Enter two Strings: ");
		sc.nextLine().trim();
		 s1=sc.nextLine();
		 //sc.nextLine().trim();
		 s2=sc.nextLine();
	
	}

	public void concate()
	{
		System.out.println("This method add the two strings together.");
		System.out.println("concatenated string is: "+(s1.concat(s2)));
	}
	public void compareTo()
	{
		System.out.println("This method return the difference (in integer) between characters of two compared strings.");
		System.out.println("Result using compare method: "+(s1.compareTo(s2)));
	}
	public void compareToIgnore()
	{
		System.out.println("This method return the difference (in integer) between characters of two compared strings.");
		System.out.println("This method ignore the case i.e. Upper Or Lower case");
		System.out.println("Result using compare method: "+(s1.compareToIgnoreCase(s2)));
	}
	public void charAt()
	{
		System.out.println("Enter string : ");
		sc.nextLine().trim();
		s1=sc.next();
		System.out.println("Enter index: ");
		index=sc.nextInt();
		
		System.out.println("Result: "+(s1.charAt(index)));

	}
	public void contains()
	{
		System.out.println("This method return true or false if the passing string is match with given String.");
		System.out.println("Your String Exist: "+(s1.contains(s1)));
	}
	public void trim()
	{
		System.out.println("This method removes the outer spaces of String and return the string.");
		System.out.println("Enter String with outer spaces.");
		sc.nextLine().trim();
		s1=sc.nextLine();
		System.out.println("Enterd String: "+s1);
		System.out.println("After using trim method: "+(s1.trim()));
	}
	public void menu()
	{
		System.out.println("**********Menu**********");
		System.out.println("1.charAt()");
		System.out.println("2.concate()");
		System.out.println("3.compareTo()");
		System.out.println("4.compareToIgnore()");
		System.out.println("5.contains()");
		System.out.println("6.trim()");
	}
	public void switchmethod()
	{
		System.out.println("Enter Your choice: ");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			{
				this.charAt();
				break;
			}
			case 2:
			{
				
				this.input();
				this.concate();
				break;
			}
			case 3:
			{
				this.input();
				this.compareTo();
				break;
			}
			case 4:
			{
				this.input();
				this.compareToIgnore();
				break;
			}
			case 5:
			{
				this.input();
				this.contains();
				break;
			}
			case 6:
			{
				this.trim();
				break;
			}
			default:
			{
				System.out.println("Enter valid choice: ");
				this.switchmethod();
			}
		}
	}
	public static void main(String[] args) {
		
		Q12_StringMethods obj=new Q12_StringMethods();
		char c;
		int temp = 1;
		do {
			obj.menu();
			obj.switchmethod();
			System.out.println("Do you want to continue?  Yes/No");
			c=obj.sc.next().charAt(0);
			if(c=='n'||c=='N')
			{
				temp=0;
				System.out.println("Thank You !.............");
			}
		}while(temp!=0);

	}

}
