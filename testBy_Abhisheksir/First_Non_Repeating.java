package testBy_Abhisheksir;

import java.util.Scanner;

public class First_Non_Repeating {

	static Scanner sc=new Scanner(System.in);
	public void check(int arr[])
	{
		int n=arr.length;
		for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n; j++)
            {
                if (i != j && arr[i] == arr[j])
                break;
            }
            if (j == n)
            {
                System.out.println("First non repeating element is: "+arr[i]);
                break;
            }
        }
			
		}
	
	
	public static void main(String[] args) {
		
		int a[]= {1,1,2,2,9,3,3,4,5,7};
		First_Non_Repeating fr=new First_Non_Repeating();
		fr.check(a);
		
		
	}

}
