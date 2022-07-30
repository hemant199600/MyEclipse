package inheritance;


class FirstI
{
	int a[];
	public void input()
	{
		a=new int[] {1,2,3,4,5};
		System.out.println("Given Array Elements:");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
class SecondI extends FirstI
{
	int b[];
	public void copy()
	{
		 b=new int[a.length];
		b=a;
	}
	public void print()
	{
		System.out.println("Copied Array:");
		for(int i=0;i<a.length;i++)
			System.out.print(b[i]+" ");
	}
}
public class QFirst {

	public static void main(String[] args) {
		SecondI s=new SecondI();
		s.input();
		s.copy();
		s.print();
	}

}
