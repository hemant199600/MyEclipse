/*8. You are given an integer N. You need to convert all zeroes of N to 5.
Input:
N = 1004
Output: 1554*/

package mixedAssignment9Aug2022;

public class Q8_Zerosto5 {

	public void  convert(int n)
	{
		int j=3,rem;
		int temp[]=new int[4];
		for(int i=n;i!=0;i/=10)
		{
			rem=i%10;
			if(rem==0)
			{
				temp[j]=5;
				j--;
			}
			else
			{
				temp[j]=rem;
				j--;
			}
		}
		for(int i=0;i<temp.length;i++)
		{
			System.out.print(temp[i]);
		}
	}
	public static void main(String[] args) {
		Q8_Zerosto5 obj=new Q8_Zerosto5();
		int n=1004;
		System.out.println("Given number:"+n);
		System.out.println("-----After replacing 0,s with 5 -----");
		obj.convert(n);

	}

}
