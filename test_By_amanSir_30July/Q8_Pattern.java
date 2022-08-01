package test_By_amanSir_30July;

public class Q8_Pattern {

	public void printPattern()
	{
		int c=64;int cc=96;
		int count=1;
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(count%2==0)
				{
					System.out.print((char)(c+count)+" ");
				}
				else
				{
					System.out.print((char)(cc+count)+" ");
				}
				count++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		Q8_Pattern pt=new Q8_Pattern();
		pt.printPattern();
	}

}
