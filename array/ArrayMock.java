package array;

public class ArrayMock {

	int A[]= {6,1,2,8,3,4,7,10,5};
	//sorting asc
	int total_sum;
	public void sort()
	{
		for(int i=0;i<A.length;i++)
		{
			for(int j=i+1;j<A.length;j++)
			{
				if(A[i]>A[j])
				{
					int temp=A[j];
					A[j]=A[i];
					A[i]=temp;
				}
			}
		}
		int n=A.length+1;
		int sum=n*(n+1);
		sum=sum/2;
		for(int i=0;i<A.length;i++)
		{
			total_sum+=A[i];
		}
		System.out.println(total_sum+" "+sum+" "+n);
		System.out.println("Missing element is:"+ (sum-total_sum));
	}
	public static void main(String[] args) {
		ArrayMock obj=new ArrayMock();
		obj.sort();


	}

}
