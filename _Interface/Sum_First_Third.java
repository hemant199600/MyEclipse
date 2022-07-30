package _Interface;
interface SumArray
{
	public int[] input_array( int size);
	public void display(int a[]);
}
public class Sum_First_Third implements SumArray
{

	public static void main(String[] args) {
		Sum_First_Third st=new Sum_First_Third();
		st.display(st.input_array(5));
		

	}

	@Override
	public int[] input_array(int size) {
		int a[]=new int[size];
		System.out.println("Enter Array Elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=ImplArea.sc.nextInt();
		}
		return a;
	}

	@Override
	public void display(int[] a) {
		System.out.println("Sum of first and third number of an array:"+(a[0]+a[2]));
		
	}

}
