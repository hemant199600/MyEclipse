package no_returntype_with_argument;
import java.util.*;
public class Ten {
	int i;
	
	public void logic(int a[])
	{
		for(i=0; i<a.length; i++)
		{
		  if(i%2==0)
		  {
			a[i]=(a[i]*a[i]);
		  }
		}
	}
	
	public void disp(int a[])
	{
		for(i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ten obj=new Ten();
		Scanner in=new Scanner(System.in);
		int i;
		int a[]=new int[7];
		System.out.println("enter the elements");
		for(i=0; i<a.length; i++)
			a[i]=in.nextInt();
		
		obj.logic(a);
		obj.disp(a);
		
		

	}

}
