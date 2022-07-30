package no_returntype_with_argument;
import java.util.*;
public class Four {
	int i,j,c=0,num;
	
	
	public void logic(int a[], int num)
	{
	       		
		for(i=0; i<a.length; i++)
		{
			if(a[i]==num)
				c++;			
		}
		if(c>0)
			System.out.println("number repeated "+c+" times.");
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Four obj=new Four();
       Scanner in=new Scanner(System.in); 
       int a[]=new int[6];
       int i;
       System.out.println("enter the elements");
       for(i=0; i<a.length; i++)
    	  a[i]=in.nextInt();
       System.out.println("enter the number");
       int num=in.nextInt();
       obj.logic(a, num);
       
       
	}

}
