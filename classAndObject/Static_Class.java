package classAndObject;

public class Static_Class {

	public static class Static
	{
		public  static void print()
		{
			System.out.println("Hello Java.");
		}
		public void method()
		{
			System.out.println("Simple method.");
		}
	}
	public static void main(String[] args) {
		Static_Class.Static.print();
		Static_Class.Static obj=new Static_Class.Static();
		obj.method();
		

	}

}
