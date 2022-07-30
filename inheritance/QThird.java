package inheritance;


class Q3FirstI
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
class Q3SecondI extends FirstI
{
	public void perform()
	{
		System.out.println("Odd position Sqaure Elements: ");
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
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
public class QThird {

	public static void main(String[] args) {
		Q3SecondI s=new Q3SecondI();
		s.input();
		s.perform();
	}

}
