package array;

public class Omkar_mock {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int size=a.length;
		if(size%2==1)
		{
			for(int i=0;i<a.length-1;i+=2)
			{
				System.out.print(a[i]+a[i+1]+" ");
			}
			System.out.print(a[a.length-1]);
		}
		else
		{
			for(int i=0;i<a.length-1;i+=2)
			{
				System.out.print(a[i]+a[i+1]+" ");
			}
		}

	}

}
