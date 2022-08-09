package stringassignment_5august2022;
public class Pattern
{
	public static void main(String args[])
	{
		int c=1,k=0;
		int ch=64;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print((char)(ch+k)+" ");
					k--;
					c++;
				}
				else
				{
					System.out.print((char)(ch+c)+" ");
					k=c;
					k=k+i+1;
					c++;
					
				}
			}
			System.out.println();
		}
	}
}