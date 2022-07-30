package inheritance;
class First
{
	public void print()
	{
		System.out.println("Parent class");
	}
}
class Second extends First
{
	public void printFirst()
	{
		System.out.println("Child first");
	}

}
class Third extends First
{
	public void PrintSecond()
	{
		System.out.println("Child Second");
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		Second s=new Second();
		Third t=new Third();
		s.print();
		s.printFirst();
		t.print();
		t.PrintSecond();
	}

}
