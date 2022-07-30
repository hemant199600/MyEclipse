package classAndObject;

public class First {
	int a,b,c;
	public void disp()
	{
		System.out.println("Addition= "+c);
	}
	public void addition()
	{
		c=a+b;
	}
	public static void main(String args[])
	{
			First f=new First();
			f.a=50;
			f.b=40;
			f.addition();
			f.disp();
	}
}
