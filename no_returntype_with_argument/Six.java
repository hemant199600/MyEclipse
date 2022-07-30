package no_returntype_with_argument;
import java.util.*;
public class Six {
	int i,j,c;
	
	public void logic(int a[])
	{
		for(i=0; i<a.length; i++)
		{
			for(j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
					c++;
				}
					
				
			}
		}
		System.out.println("the count of duplicate number is= "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Six obj=new Six();
		Scanner in=new Scanner(System.in);
       int a []= new int[10];
       int i;
       System.out.println("enter the element");
       for(i=0; i<a.length; i++)
    	   for(i=0; i<a.length; i++)
    		   a[i]=in.nextInt();
       obj.logic(a);
	}

}
