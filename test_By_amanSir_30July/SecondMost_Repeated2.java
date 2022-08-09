package test_By_amanSir_30July;

import java.util.Scanner;

class repeat
{
	int i,j,k;
	int a[]=new int[10];
	int b[]=new int[10];
	int d[]=new int[10];
	int lock=-1, c=1;
	int count=0;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements in an Array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public void display()
	{

		System.out.println("Array Elements Are: ");
		for(i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		System.out.println();
	}
	
	public void Check()
	{

		for(i=0; i<a.length; i++)
		{
            c=1;
		   for(j=i+1;j<a.length;j++)
           {
		      if(a[i]==a[j])
              {
                c++;
                b[j]=lock;
              }
           }
			if(b[i]!=lock)
	         b[i]=c;
			d[i]=b[i];
		}
		
	}
	public int sortDesc()
	{
		int k;
         for(i=0;i<b.length;i++)
          {
           for(j=i+1;j<b.length;j++)
           {
               if(b[i]<b[j])
               {
	               k=b[j];
	               b[j]=b[i];
				   b[i]=k;
               }
           }
           
         }
         return b[1];
	}
	public void display1()
	{

		System.out.println("Array Elements Are: ");
		for(i=0;i<a.length;i++)
		{
			System.out.print(" "+b[i]);
		}
		System.out.println();
	}
	public void find_Second_Most_Repeated(int k)
	{
		System.out.println("Second most Repeated Element :");
		if(this.secondMaxFreq(k)!=true)
		{
			for(int i=0;i<b.length;i++)
			{
				if(d[i]==k)
				{
					System.out.print(a[i]);
					break;
				}
			}
			System.out.println();
		}
		else
		{
			k=b[count];
			for(int i=0;i<b.length;i++)
			{
				if(d[i]==k)
				{
					System.out.print(a[i]);
					break;
				}
			}
			System.out.println();
		}
				
	}
	public boolean secondMaxFreq(int k)
	{
		for(int i=0;i<d.length;i++)
		{
			if(b[i]==k)
			{
				count++;
			}
		}
		if(count>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
public class SecondMost_Repeated2 
{

	public static void main(String[] args) 
	{
		repeat ob=new repeat();
		ob.input();
		ob.display();
		ob.Check();
		int k=ob.sortDesc();
		ob.find_Second_Most_Repeated(k);

	}

}
