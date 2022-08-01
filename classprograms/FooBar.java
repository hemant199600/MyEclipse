package classprograms;

public class FooBar {
	public void fooBar(int n)
	{
		if(n==100)
		{
			return;
		}
		if(n%5==0)
		{
			System.out.print("foo");
		}
		else
		{
			
			if(n%7==0)
				{
					System.out.print("");
				}
			else
			{
				System.out.print(n);
			}
		}
		if(n%7==0)
		{
			System.out.print("bar");
		}
		System.out.println();
		n=n+1;
		fooBar(n);
	}

	public static void main(String[] args) {
		FooBar fb=new FooBar();
		fb.fooBar(1);

	}

}
