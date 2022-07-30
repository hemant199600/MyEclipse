package inheritance;


class Q4FirstI
{
	int a[];
	public void input()
	{
		a=new int[] {22,33,-44,32,-42,-88,99};
		System.out.println("Given Array Elements:");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
class Q4SecondI extends Q4FirstI
{
	public void perform()
	{
		System.out.println("Shifted Elements: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
}
public class QFourth {

	public static void main(String[] args) {
		Q4SecondI s=new Q4SecondI();
		s.input();
		s.perform();
	}

}
