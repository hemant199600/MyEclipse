package inheritance;


class Q2FirstI
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
class Q2SecondI extends FirstI
{
	public void perform()
	{
		System.out.println("Even position Sqaure Elements: ");
		for(int i=0;i<a.length;i++)
		{
			if(i%2==1)
			{
				System.out.print((a[i]*a[i])+" ");
			}
			else
			{
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
	}
	
}
public class QSecond {

	public static void main(String[] args) {
		Q2SecondI s=new Q2SecondI();
		s.input();
		s.perform();
	}

}
