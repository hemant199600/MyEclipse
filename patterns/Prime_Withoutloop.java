package patterns;

public class Prime_Withoutloop {
	int c=0;
	public int prime(int p,int n)
	{
		
		if(p%n==0)
		{
			c++;
		} 
		if(p==n&& c>0)
		{
			System.out.println("prime number.");
			System.exit(0);
		}
		
		n=n+1;
		return prime(p,n);
		
	}
	public static void main(String[] args) {
		Prime_Withoutloop pr=new Prime_Withoutloop();
		
		pr.prime(4, 2);
	}

}
