package constructor;

import java.util.Scanner;

public class Sixteen {

	int a[][];
	Scanner sc;
	Sixteen()
	{
		sc=new Scanner(System.in);
		this.input();
		
	}
	public void input()
	{
		a= new int[][]{
			{1,2,3},
			{4,5,6},
			{7,8,9}
				
		};
	}
	public void display()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void upperTrangular()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(i>j)
				{
					a[i][j]=0;
				}
			}
		}
	}
	public void lowerTrangular()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(i<j)
				{
					a[i][j]=0;
				}
			}
		}
	}
	public static void main(String[] args) {
		Sixteen st=new Sixteen();
		System.out.println("Initialized matrix:");
		st.display();
		System.out.println("Upper Trangular:");
		st.upperTrangular();
		st.display();
		System.out.println("Lower Trangular: ");
		st.input();
		st.lowerTrangular();
		st.display();
		
	}

}
