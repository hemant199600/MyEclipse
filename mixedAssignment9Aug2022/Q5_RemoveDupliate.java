package mixedAssignment9Aug2022;

import java.util.Scanner;

public class Q5_RemoveDupliate {

	Scanner sc=new Scanner(System.in);
	int a[]= {1,2,2};
	public void display()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public void find()
	{
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=-1;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=-1)
			{
				System.out.print(a[i]+" ");
			}
		}
		
	}
	public static void main(String[] args) {
		Q5_RemoveDupliate obj=new Q5_RemoveDupliate();
		obj.display();
		obj.find();

	}

}
