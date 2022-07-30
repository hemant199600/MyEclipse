package array;

import java.util.Scanner;

class MostRepeated

{

	public static void main(String[] args)

	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of Array");
		int S = sc.nextInt();
		int[] a = new int[S];
		int[] b = new int[a.length];

		int i, j, c = 1, lock = -1;

		System.out.println("Enter Element in an Array: ");

		for (i = 0; i < a.length; i++)

		{

			a[i] = sc.nextInt();
		}

		System.out.println("Entered Element in an Array: ");

		for (i = 0; i < a.length; i++)

		{

			System.out.println(" " + a[i]);
		}

		for (i = 0; i < a.length; i++) {

			c = 1;

			for (j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					c++;
					b[j] = lock;
				}
			}
			if (b[i] != lock)
				b[i] = c;
		}
		System.out.println("\nFrequency Of An Array: ");
		System.out.println("Elements Frequency");

		for (i = 0; i < a.length; i++) {
			if (b[i] != lock)
				System.out.println(a[i] + "\t " + b[i]);
		}
		int max=0,index=0;
		for (i = 0; i < b.length; i++) {
//			for (j = i + 1; j < b.length; j++) {
//				if (b[i] > b[j]) {
//					k = b[j];
//					b[j] = b[i];
//					b[i] = k;
				if(b[i]>max)
				{
					max=b[i];
					index=i;
				}
//				}
			
			}
		
		System.out.println("Most Repeated Element In an Array: ");

		System.out.println(a[index] + " ");

		//System.out.println("Least Repeated Elements In an Array: ");
		
	}

}

//Most and Least Repeated Elements in an Array
