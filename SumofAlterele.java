
import java.util.*;
public class SumofAlterele {
	int a[];
	int n;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of elements:");
		
		int n=sc.nextInt();
		a=new int [n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public void logic()
	{
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumofAlterele obj=new SumofAlterele();
		obj.input();
		obj. logic();
	}

}
