package classprograms;
class First
{
	int a=10;
	First()
	{
		System.out.println("this is parent class constructor");
	}
	public void display()
	{
		System.out.println("Value of parent a: "+a);
	}
}
class Second extends First{
	int a=20;
	Second()
	{
		super();
		System.out.println("this is child class constructor.");
	}
	public void display()
	{
		int a=30;
		System.out.println("Value of Local a:"+a);
		System.out.println("Value of child a: "+this.a);
		super.display();
	}
}
public class Super_Keyword {

	public static void main(String[] args) {
		Second s=new Second();
		s.display();
	}

}
