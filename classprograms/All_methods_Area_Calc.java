package classprograms;

import java.util.Scanner;

public class All_methods_Area_Calc {
	float pi=3.14f;
	Scanner sc=new Scanner(System.in);
	
	public int input()
	{
		int p=sc.nextInt();
		return p;
	}
	
	public void circle()
	{
		System.out.println("Enter radius: ");
		float r=sc.nextFloat();
		System.out.println("Area : "+(pi*(r*r)));
	}
	
	
	public int rect(int x,int y)
	{
		return x*y;
	}
	
	public void square(int x)
	{
		System.out.println("Multiplication: "+(x*x));
	}
	
	
	public double traingle()
	{
		System.out.println("Enter Base : ");
		int l=sc.nextInt();
		System.out.println("Enter Height : ");
		int m=sc.nextInt();
		return (0.5*(l*m));
	}
	public void menus()
	{
		System.out.println("1.Area Of Circle");
		System.out.println("2.Area of Rectangle");
		System.out.println("3.Area of Square");
		System.out.println("4.Area of Traingle");
	}
	
	public static void main(String[] args) {
		All_methods_Area_Calc al=new All_methods_Area_Calc();
		Scanner sc=new Scanner(System.in);
		System.out.println("*********Area Calculator***********");
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
					al.circle();
					break;
				}
				case 2:
				{
					System.out.println("Enter length:");
					int a=al.input();
					System.out.println("Enter breadth:");
					int b=al.input();
					System.out.println("Area of Rectangle: "+al.rect(a,b));
					break;
				}
				case 3:
				{
					System.out.println("Enter side :");
					int a=al.input();
					al.square(a);
					break;
				}
				case 4:
				{
					System.out.println("Area of Traingle: "+al.traingle());
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
