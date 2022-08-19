package array;

public class Second_maxWithoutSorting {

	int[] a= {1,2,3,4,3,5,6};
	public void find()
	{
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		int smax=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=max&&a[i]>smax)
			{
				smax=a[i];
			}
		}
		System.out.println("Second max:"+smax);
	}
	public static void main(String[] args) {
		Second_maxWithoutSorting obj=new Second_maxWithoutSorting();
		obj.find();

	}

}
