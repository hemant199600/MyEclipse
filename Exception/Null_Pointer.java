package Exception;

public class Null_Pointer {
	int a[];
	public void check()
	{
		System.out.println(a.length);
	}
	public static void main(String[] args) {
		Null_Pointer obj=new Null_Pointer();
		try
		{
			obj.check();
		}
		catch(NullPointerException e)
		{
			System.out.println("Please check array size : ");
			e.printStackTrace();
		}

	}

}
