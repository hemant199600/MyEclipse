package object_Assignment;

import java.util.Scanner;

public class Prime1_N {
	Scanner sc;
	int range;

	public void input() {
		sc = new Scanner(System.in);
		System.out.println("Enter range: ");
		range = sc.nextInt();
	}

	public void prime() {
		int i;
		for(int j=1;j<=range;j++)
		{
			for (i = 2; i <= j; i++) {
				if (j % i == 0)
					break;
	
			}
			if (j == i) {
				System.out.print(j+" ");
			} 
		}
	}

	public static void main(String[] args) {
		Prime1_N pn=new Prime1_N();
		pn.input();
		pn.prime();

	}

}
