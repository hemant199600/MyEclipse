package Assignment25july;

public class Second_Max {

	int a[]= {1,25,8,74,96,13};
	public void display()
	{
		System.out.print("Array Elements: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public void find()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Second max from Array: "+a[a.length-2]);
	}
	public static void main(String[] args) {
		Second_Max sm=new Second_Max();
		sm.display();
		sm.find();
	}

}
