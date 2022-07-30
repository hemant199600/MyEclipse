package object_Assignment;

import java.util.Scanner;

public class Table1_N {
	Scanner sc;
	int no;

	public void input() {
		sc = new Scanner(System.in);
		System.out.println("Enter range: ");
		no = sc.nextInt();
	}

	public void table() {
		for (int j = 1; j <= no; j++) {
			for (int i = 1; i <= 10; i++) {
				System.out.print((j * i)+"\t");
			}
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		Table1_N tb=new Table1_N();
		tb.input();
		tb.table();

	}

}
