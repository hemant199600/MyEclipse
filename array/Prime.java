package array;

public class Prime {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		for(int i=0;i<a.length;i++)
		{
			int j=2;
			while(j<a[i])
			{
				if(a[i]%j==0)
				{
					break;
				}
				j++;
			}
			if(a[i]==j)
			{
				System.out.print(a[i]+" ");
			}
			
		}

	}

}
