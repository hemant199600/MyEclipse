package no_returntype_with_argument;
import java.util.*;
public class Frequency 
{
	Scanner in=new Scanner(System.in);
    int i,j,lock=-1,c=0,size;
    int [] a=new int[size];
    int [] b=new int[a.length];
       
    public void input()
    {
    	System.out.println("enter the size of array");
	    size=in.nextInt();
	    a=new int[size];
	    b=new int[a.length];
	    System.out.println("enter the elements of array");
        for(i=0; i<a.length; i++)
        	a[i]=in.nextInt(); 
    }
     
    public void disp()
    {
    	System.out.println("display the array ");
    	for(i=0; i<a.length; i++)
    		System.out.print(a[i]+" ");
  
    	System.out.println();
    }
    
    public void logic()
    {
    	for(i=0; i<a.length; i++)
    	{
    		c=1;
    		for(j=i+1; j<a.length; j++)
    		{
    			if(a[i]==a[j])
    			{
    				c++;
    				b[j]=lock;
    				
    			}
    		}
    		if(b[i]!=lock)
    			b[i]=c;
    	}
    }
    
      public void finalpart()
      {
    	  System.out.println("-----FREQUENCY-----");
    	  System.out.println("ELEMENTS\tFREQUENCY");
    	  for(i=0; i<a.length; i++)
    	  {
    		  if(b[i]!=lock)
    			  System.out.println(a[i]+"\t\t"+b[i]);
    		  
    	  }
      }
      
      
      
      
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frequency obj= new Frequency();
		{
			obj.input();
			obj.disp();
			obj.logic();
			obj.finalpart();
			
		}

	}

}
