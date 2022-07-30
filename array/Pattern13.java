package array;

/*
1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1 
*/
class Pattern13
{
public static void main(String args[])
{
	int c=1;
	for(int i=1;i<=5;i++)
	{
		//spacing
		for(int j=1;j<=5-i;j++)
		{
			System.out.print(" ");
		}
		c=1;
		for(int j=1;j<=i;j++)
		{
			System.out.print(c+" ");
			c=c*(i-j)/j;
		}
		System.out.println();
	}
}
}