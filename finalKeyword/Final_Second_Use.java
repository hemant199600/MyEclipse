package finalKeyword;

class Demo
{
	 int a=10;
	 final public void disp()//if we use the final Keyword Here we can not override this method into child class
	 {
		 System.out.println("The value of a:"+a);
	 }
}
class Demo2 extends Demo
{
	public void disp()//it will show the error Cannot override the final method from Demo
	{
		a=100;
		System.out.println("The value of a:"+a);
	}
}
public class Final_Second_Use {

	public static void main(String[] args) {
		Demo2 dm=new Demo2();
		dm.disp();

	}

}
