package inheritance;

import java.util.Scanner;

class Q6First
{
	int a[]=new int[20];
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter Array Elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
}
class Q6Second extends Q6First
{
	int p,n,o,e,z;
	public void perform()
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				p++;
				if(a[i]%2==0)
				{
					e++;
				}
				else
				{
					o++;
				}
			} 
			else if(a[i]==0)
			{
				z++;
			}
			else
			{
				n++;
			}
		}
	}
	public void print()
	{
		System.out.println("Number of Zeros      : "+z);
		System.out.println("Number of Positive no: "+p);
		System.out.println("Number of Negative no: "+n);
		System.out.println("Number  of   Even  no: "+e);
		System.out.println("Number  of   Odd   no: "+o);
	}
}
public class QSixth {

	public static void main(String[] args) {
		Q6Second s=new Q6Second();
		s.input();
		s.perform();
		s.print();

	}

}
