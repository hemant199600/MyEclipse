package polymorphism;

public class Sum {

	public void sum(int a)
	{
		System.out.println("value of  int "+(a));
	}
	public void sum(int a,int b)
	{
		System.out.println("sum of int "+(a+b));
	}
	public void sum(double a,double b)
	{
		System.out.println("double of int "+(a+b));
	}
	public static void main(String[] args) {
		Sum s=new Sum();
		s.sum(4);
		s.sum(4, 5);
		s.sum(6, 7);
	}

}
