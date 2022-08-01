package test_By_amanSir_30July;

public class Q4_Missingnumber {

	int a[];
	public Q4_Missingnumber() {
		a= new int[]{1,2,3,4,5,7,8,9,10}; 
	}
	
	public void findMiss()
	{
		int sum=0;
		int exp=a.length+1;
		int sum_Exp=(exp*(exp+1))/2;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("The missing number is :"+(sum_Exp-sum));
	}
	public void display()
	{
		System.out.println("Array Elements are: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Q4_Missingnumber mn=new Q4_Missingnumber();
		mn.display();
		mn.findMiss();

	}


}


