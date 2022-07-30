package array;

public class Insertion_User {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int pos=2,el=12;
		System.out.println("before insertion: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=a.length-1;i>pos-1;i--)
		{
			a[i]=a[i-1];
		}
		a[pos-1]=el;
		System.out.println("After insertion: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
