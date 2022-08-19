package mixedAssignment9Aug2022;

import java.util.Scanner;

import strings.First_Upper;

public class  Q3_Array_Leader{

	Scanner sc=new Scanner(System.in);
	int a[]= {16,17,4,3,5,2};
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
			int max=0;
			for(int j=i;j<a.length;j++)
			{
				if(max<a[j])
					max=a[j];
			}
			if(a[i]==max) {System.out.print(max+" ");}
			
		}
		
	}
	public static void main(String[] args) {
		Q3_Array_Leader obj=new Q3_Array_Leader();
		obj.display();
		obj.find();

	}

}
