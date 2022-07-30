package classprograms;

import java.util.Scanner;

class Input
{
	Scanner sc;
	public Input() {
		sc=new Scanner(System.in);
	}
	public int [] input(int a[],int size)
	{
		System.out.print("Enter Array Elements:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println();
		return a;
	}
}
class Insert extends Input
{
	public int[] insert(int b[],int pos,int el)
	{
		
		int i;
		for(i=b.length-1;i>pos-1;i--)
		{
			b[i]=b[i-1];
		}
		b[i]=el;
		return b;
	} 
	
	
}
class Print extends Insert
{
	public void print(int a[],int size)
	{
		System.out.print("Array Elements are:");
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
}
}
public class Insertion {

	public static void main(String[] args) {
		Print pr=new Print();
		System.out.println("Enter Size: ");
		int size=pr.sc.nextInt();
		int a[]=new int[size+1];
		int b[]=pr.input(a, size);
		System.out.println("Enter Positon: ");
		int pos=pr.sc.nextInt();
		System.out.println("Enter Element: ");
		int el=pr.sc.nextInt();
		int c[]=pr.insert(b, pos, el);
		pr.print(c, size+1);
	}

}
