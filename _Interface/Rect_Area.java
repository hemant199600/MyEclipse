package _Interface;

import java.util.Scanner;

class ImplArea implements Area
{
	int a,b,area,perimeter;
	static Scanner sc=new Scanner(System.in);
	@Override
	public void area() {
		area=a*b;
	}
	public void perimeter() {
		perimeter=2*(a+b);
	}

	@Override
	public void display() {
		System.out.println("Area of Rectangle      : "+area+" square units.");
		System.out.println("Perimeter of rectangle : "+perimeter);
	}
	public void input()
	{
		System.out.println("Enter length:");
		a=sc.nextInt();
		System.out.println("Enter breadth:");
		b=sc.nextInt();
	}
	
}
public class Rect_Area 
{

	public static void main(String[] args) {
		ImplArea ra=new ImplArea();
		System.out.println("******Area*******");
		ra.input();
		ra.area();
		
		System.out.println("*******perimeter******");
		ra.input();
		ra.perimeter();
		ra.display();

	}

}
