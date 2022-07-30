package patterns;

public class Pattern1 {

	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		int b[]= {10,11,12,13,14};
		int c[]=new int [a.length+b.length];
		int f=a.length-1;
		int s=0;
		System.out.println("array first:");
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("array Second:");
		for(int i=0;i<5;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
		for(int i=0;i<5;i++)
		{
			c[s]=a[f];
			s++;
			c[s]=b[i];
			f--;
			s++;
		}
		System.out.println("Merged Array: ");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.println();
	}

}
