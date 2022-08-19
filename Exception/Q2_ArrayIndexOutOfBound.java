package Exception;

public class Q2_ArrayIndexOutOfBound {

	int a[]={1,2,3,4};
	public void check()
	{
		System.out.println(a[4]);
	}
	public static void main(String[] args) {
		Q2_ArrayIndexOutOfBound obj=new Q2_ArrayIndexOutOfBound();
		try
		{
			obj.check();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Please check array size : ");
			e.printStackTrace();
		}

	}

}
