package Assignment_Matrix;

public class Smallest_No {

	public static void main(String[] args) {
		int a[]=  {22,33,-44,32,-42,-88,99};
		System.out.println("Given Array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
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
		for(int i=0;i<a.length/2;i++)
		{
			for(int j=i+1;j<a.length/2;j++)
			{
				if(a[i]<a[j]&&a[i]<0)
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
			
		}
		System.out.println();
		System.out.println("Sorted array is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
