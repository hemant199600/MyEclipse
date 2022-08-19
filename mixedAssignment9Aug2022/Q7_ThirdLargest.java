/*7. Given an array of distinct elements. Find the third largest element in it.

Suppose you have A[] = {1, 2, 3, 4, 5, 6, 7}, its output will be 5 because it is the 3 largest element in the array A.
*/
package mixedAssignment9Aug2022;

public class Q7_ThirdLargest {

	public int find(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		return a[2];
	}
	public void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int a[]= {1, 2, 3, 4, 5, 6, 7};
		Q7_ThirdLargest obj=new Q7_ThirdLargest();
		System.out.println("---Given Array---");
		obj.display(a);
		System.out.println("Third largest number from the given array: "+obj.find(a));

	}

}
