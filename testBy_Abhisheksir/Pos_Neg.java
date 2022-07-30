package testBy_Abhisheksir;
public class Pos_Neg {
	public int  sort(int a[],int k)
	{
		
		return 0;
	}
	public static void main(String[] args) {
		int a[]= {1,-2,4,5,6,-8,9,10};	
		//int a[]= {1,-2,4,-5,6,-8,9,10};	
		//int a[]= {6,5,8,-2,-3,1,4,7};	//   6 -2 5 -3 8 1 4 7 
		System.out.println("Given Array:");
		Pos_Neg p=new Pos_Neg();
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		int count=0;
		//finding count of negative number
		for(int j=0;j<a.length;j++)
		{
			if(a[j]<0)
			{
				count++;
			}
		}
		
		
		
		//shifting negative element to end of the array
		for(int i=0;i<a.length;i++)
		{
			int z=a[i];
			for(int n=i+1;n<a.length;n++)
			{
				if(a[i]<0)
				{
					int temp=a[n];
					a[n]=a[i];
					a[i]=temp;
				}
			}
		}
		
		
		int k=a.length-1;
		int i;
		for(i=0;i<a.length;i++)
		{
			int z=1;
			if(i%2==1&&a[k]<0)
			{
				for(int i1=i-1;i1<count;i1++)
				{
					int temp=a[a.length-1];
					for(int j1=a.length-1;j1>z;j1--)
					{
						a[j1]=a[j1-1];
					}
					a[z]=temp;
					z+=2;
				}
			}
		}
		System.out.println();
		System.out.println("Sorted array:");
		for(int i1=0;i1<a.length;i1++)
		{
			System.out.print(a[i1]+" ");
		}

		
	}

}
