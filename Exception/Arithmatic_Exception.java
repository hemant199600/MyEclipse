package Exception;

public class Arithmatic_Exception {
	int a[]= {1,2};
	public void check()
	{
		System.out.println(a[1]/0);
	}
	public static void main(String[] args) {
		Arithmatic_Exception obj=new Arithmatic_Exception();
		try
		{
			obj.check();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero error: ");
			e.printStackTrace();
		}

	}


}
