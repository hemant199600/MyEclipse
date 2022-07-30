package _Interface;

import java.util.Scanner;

class Area_circle implements CircleArea
{
	Scanner sc=new Scanner(System.in);
	@Override
	public double input() {
		System.out.print("Enter radius: ");
		System.out.println();
		double r=sc.nextFloat();
		return r;
	}

	@Override
	public void result(double r) {
		
		System.out.println("Area of Circle:"+(3.14*(r*r)));
	}
	
}
public class Area_C  {

	public static void main(String[] args) {
		Area_circle ac=new Area_circle();
		double r=ac.input();
		ac.result(r);

	}

}
