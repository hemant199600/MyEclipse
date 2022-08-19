package threading;

class MyThread extends Thread
{
	public void show()
	{
		System.out.println("Hi i am thread.");
	}
	public void run()
	{
		show();
	}
}
public class Custom1 {

	public static void main(String[] args) {
		MyThread th=new MyThread();
		th.start();

	}

}
