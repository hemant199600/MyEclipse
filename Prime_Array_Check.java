import java.util.Scanner;

public class Prime_Array_Check {

	Scanner sc=new Scanner(System.in);
	int a[];
	int size;
	public void input()
	{
		System.out.println("Enter size:");
		size=sc.nextInt();
		a=new int[size];
		System.out.println("Enter Array Elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
	}
	public void check()
	{
		for(int i=0;i<a.length;i++)
		{
			int j;
			for(j=2;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					break;
				}
			}
			if(a[i]==j)
			{
				System.out.println(a[i]+"\tPrime");
			}
			else
			{
				System.out.println(a[i]+"\tnot Prime");
			}
		}
	}
	public static void main(String[] args) {
		Prime_Array_Check obj=new Prime_Array_Check();
		obj.input();
		obj.check();

	}

}
