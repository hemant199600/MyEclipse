package  no_returntype_with_argument;
import java.util.*;
public class Fourteen {
	int i,j,k;
	
	public void logic(int a[])
	{
		for(i=0; i<a.length; i++)
		{
			for(j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					k=a[j];
					a[j]=a[i];
					a[i]=k;
					
				}
			}
		}
		
		  for(i=0; i<a.length; i++)
		  {
			  for(j=i+1; j<a.length; j++)
			  {
				  if(a[i]>a[j])
				  {
					  k=a[j];
						a[j]=a[i];
						a[i]=k;
				  }
			  }
		  }
	}
	
	public void disp(int a[])
	{
		System.out.println("The final result after half asc and half des=");
		for(i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fourteen obj=new Fourteen();
		
		Scanner in=new Scanner(System.in);
		int i;
		int a[] =new int []{9,1,3,5,6,11,22,66,10,19};
		System.out.println("the size of array");
		for(i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		    System.out.println();
		
		obj.logic(a);
		obj.disp(a);
		

	}

}
