package classprograms;

public class This_1 {
	int a=10;
	public void method1()
	{
		int a=20;//if we dosen't take int it will change value of a to 20 
		System.out.println("Instance variable :"+this.a);
		System.out.println("Method or local variable: "+a);
	}
	public static void main(String[] args) {
		This_1 th=new This_1();
		th.method1();

	}

}
