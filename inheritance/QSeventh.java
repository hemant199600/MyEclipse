package inheritance;

import java.util.Scanner;

class Q7First
{
	double no_of_class_held;
	double no_of_class_taken;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.print("Enter no of classes held: ");
		no_of_class_held=sc.nextDouble();
		System.out.print("Enter no of classes taken: ");
		no_of_class_taken=sc.nextDouble();
		System.out.println();
	}
}
class Q7Second extends Q7First
{
	int cc;
	public void perform()
	{
		double cc=(no_of_class_taken/no_of_class_held)*100;
		System.out.println("percentage of Class attended:  "+cc+"%");
		if(cc>=75.00)
		{
			System.out.println(" Granted for Exam");
		}
		else
		{
			System.out.println(" Not granted for Exam");
		}
	}
	
}
public class QSeventh {

	public static void main(String[] args) {
		Q7Second s=new Q7Second();
		s.input();
		s.perform();

	}

}
