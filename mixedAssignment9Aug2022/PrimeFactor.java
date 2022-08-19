package mixedAssignment9Aug2022;

public class PrimeFactor {
	
	public void factor(int n)
	{
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				if(this.prime(i))
				{
					System.out.print(i+" ");
				}
			}
		}
	}
	public boolean prime(int n)
	{
		int i;
		for(i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				break;
				
			}
		}
		if(i==n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		PrimeFactor obj=new PrimeFactor();
		obj.factor(20);
		//obj.prime(5);

	}

}
