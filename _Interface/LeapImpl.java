package _Interface;

import java.util.Scanner;

class MainLeap  implements Leap
{

	@Override
	public boolean checkCentury(int y) {
		if(y%100!=0)
		{
			return true;
		}
		else
		return false;
	}

	@Override
	public boolean checkyear(int y) {
		if(y%4==0)
			return true;
		return false;
	}

	@Override
	public boolean checkmulcent(int y) {
		
		if(y%400==0)
			return true;
		return false;
	}
	
}
public class LeapImpl {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		MainLeap ml=new MainLeap();
		System.out.println("Enter Year");
		int year=sc.nextInt();
		boolean ch_100=ml.checkCentury(year);
		boolean ch_400=ml.checkmulcent(year);
		boolean ch_4=ml.checkyear(year);
		if((ch_4&&ch_100)||(ch_400))
			System.out.println("Leap Year.");
		else
			System.out.println("not Leap Year.");
	}
}
