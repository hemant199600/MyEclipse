package polymorphism;

class Override_Eg{
	public void disp()
	{
		System.out.println("I am parent class method.");
	}
}
class Demo extends Override_Eg
{
	public void disp()
	{
		super.disp();
		System.out.println("I am child class method.");
	}
}
public class Overriding_eg {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.disp();
		

	}

}
