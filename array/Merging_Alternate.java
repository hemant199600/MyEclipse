package array;
//output:{1,14,2,13,3,12,4,11,5,10}
public class Merging_Alternate {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5};
		int b[]=new int[] {10,11,12,13,14};
		int[] temp=new int[a.length+b.length];
		int c=0;
		int k=b.length-1;
		for(int i=0;i<temp.length;i++)
		{
			if(i%2==0)
			{
				temp[i]=a[c];
				c++;
			}
			else
			{
				temp[i]=b[k];
				k--;
			}		
		}
		System.out.println("result: ");
		for(int i=0;i<temp.length;i++)
			System.out.print(temp[i]+" ");

	}

}
