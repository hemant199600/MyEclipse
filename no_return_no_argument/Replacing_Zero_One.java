package no_return_no_argument;

public class Replacing_Zero_One {
	int a[]= {26,0,67,45,0,78,54,34,10,0,34};
	public void replace()
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				a[i]=1;
			}
		}
	}
	public void display()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Replacing_Zero_One rp=new Replacing_Zero_One();
		System.out.println("Before replacing 1's");
		rp.display();
		System.out.println("After replacing 1's");
		rp.replace();
		rp.display();
	}

}
