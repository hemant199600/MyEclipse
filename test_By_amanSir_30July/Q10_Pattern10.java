                                                                                                                                            package test_By_amanSir_30July;

public class Q10_Pattern10 {

	public void printPattern()
	{
		for(int i=9;i>=1;i--)
		{
			if(i%2==1)
			{
				for(int j=i+2;j<=9;j+=2)
				{
					System.out.print("-");
				}
				for(int k=i;k>=1;k--)
				{
					if(i==1||k==1||k==i|i==9)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print("=");
					}
				}
				System.out.println(	);
			}
		}
	}
	public static void main(String[] args) {
		Q10_Pattern10 pt=new Q10_Pattern10();
		pt.printPattern();

	}

}
