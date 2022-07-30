package no_returntype_with_argument;
import java.util.*;
public class Nine {
	int i;
	
	public void logic(int a[])
	{
		System.out.println("the new elements");
		for(i=0; i<a.length; i++)
		{
			if(a[i]<0)
			{
				a[i]=a[i-1]*a[i-1];	
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
		Nine obj=new Nine();
      Scanner in=new Scanner(System.in);
      int a[]=new int[] {12,3,-19,29,5,-61,44,7,-9};
      int i;
      System.out.println("the array elements ");
      for(i=0; i<a.length; i++)
      System.out.print(a[i]+" ");
      System.out.println();
      obj.logic(a);
      obj.disp(a);
	}

}
