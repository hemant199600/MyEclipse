package array;

public class SendBack1 {

	int a[]= {1,0,0,0,1,0,0,1};
	public void convert()
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				count++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(i<count)
			System.out.print(0+" ");
			else
				System.out.print(1+" ");
		}
	}
	public static void main(String[] args) {
		SendBack1 obj=new SendBack1();
		obj.convert();
	}

}
