package Assignment_Matrix;

public class Q1Ini_Print {
	public void print()
	{
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1Ini_Print obj=new Q1Ini_Print();
		obj.print();
	}

}
