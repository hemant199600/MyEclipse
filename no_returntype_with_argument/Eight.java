package no_returntype_with_argument;import java.util.*;
public class Eight {
int i;	

public void logic(int a[])
{
	System.out.println("Number of even number");
	  for(i=0; i<a.length; i++)
	  {
		  if(i%2==1)
			  System.out.print(a[i]);
	  }
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eight obj=new Eight();
		Scanner in=new Scanner(System.in);
		int a[] =new int[7];
		int i;
		System.out.println("enter the element");
		for(i=0; i<a.length; i++)
			a[i]=in.nextInt();
		obj.logic(a);	
	}

}
