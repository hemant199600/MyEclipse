package classprograms;

public class Constructor {
	int a[]={1,2,3,4,5,6};
	public Constructor()
	{
		System.out.println("Array in Reverse:");
		for(int i=1;i<=a.length;i++)
		{
			System.out.print(a[a.length-i]+" ");
		}
		System.out.println();
	}
	public void display()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		Constructor c=new Constructor();
		System.out.println("Array in Simple: ");
		c.display();
	}

}
