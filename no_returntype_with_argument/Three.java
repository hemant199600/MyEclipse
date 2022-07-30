package no_returntype_with_argument;
import java.util.*;
public class Three 
{
	int i;
	
	public void input(int a[])
	{
		System.out.println("enter the element");
		for(i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		    System.out.println();
		
		
		for(i=0; i<a.length; i++)
			
		{
			if(a[i]==0)
				{
				a[i]=1;
				}
		}
		System.out.println("after insert 1");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) 
	{
		Three obj=new Three(); 
		
		int [] a=new int []{26,0,67,45,0,78,54,10,0,34};
		
		
		obj.input(a);
	}

}
