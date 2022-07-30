package Assignment25july;

public class Merging_TwoArray {

	
	public void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public void merging(int a[],int b[],int c[])
	{
			int i=0;
			int j;
			for(j=0;j<a.length;j++)
			{
				c[i]=a[j];
				i++;
			}
			for(int  k=0;k<b.length;k++)
			{
				c[i]=b[k];
				i++;
			}
			System.out.print("Merged Array: ");
		this.display(c);
		
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10};
		int c[]=new int[a.length+b.length];
		System.out.print("Array First: ");
		Merging_TwoArray m=new Merging_TwoArray();
		m.display(a);
		System.out.print("Array Second: ");
		m.display(b);
		m.merging(a, b, c);
	}

}
