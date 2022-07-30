package Assignment25july;

public class Even_Square_Odd_Cube {

	public void calculate(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				a[i]=(a[i]*a[i]*a[i]);
			}
			else
			{
				a[i]=(a[i]*a[i]);
			}
		}
	}
	public void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		Even_Square_Odd_Cube es=new Even_Square_Odd_Cube();
		System.out.print("Array Elements   : ");
		es.display(a);
		es.calculate(a);
		System.out.print("After calculating: ");
		es.display(a);
	}

}
