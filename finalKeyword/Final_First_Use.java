package finalKeyword;

class Demo
{
	final int a=10;//if we use final here
}
class Demo2 extends Demo
{
	public void disp()
	{
		a=100;//here we can not reassign final variable value
		System.out.println("The value of a:"+a);
	}
}
public class Final_First_Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
