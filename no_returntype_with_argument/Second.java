package no_returntype_with_argument;
import java.util.Scanner;
public class Second {
	int i,size,sum=0,c=0;
	
	public void disp(int a[])
	{	
		for(i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
			if(a[i]%2==1)
			{
				sum=sum+a[i];
			    c++;
			}
		}
		System.out.println("sum of odd number="+sum);
		System.out.println("count of odd number="+c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second obj=new Second();
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size");
		int size=in.nextInt();
		int a[]=new int [size];
		int i;
		System.out.println("the elements are");
		for(i=0; i<a.length; i++)
			a[i]=in.nextInt();
		
		obj.disp(a);
		
		
	}



	

	}


