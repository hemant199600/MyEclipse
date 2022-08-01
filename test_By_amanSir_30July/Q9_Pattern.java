package test_By_amanSir_30July;

public class Q9_Pattern {

	public void printPattern()
	{
		int c = 0;
		int rc=3;
		int cc=3;
		for(int i=9;i>=1;i--)
		{
			
			
				for(int j=i;j>=1;j--)
				{
					int k=9;
					if(i>5)
					{
						if(i%2==1)
						{
							if(j>5)
							{
								if(j%2==1)
								{
									c=k-cc;
									System.out.print((c)+"");
									cc--;
								}
								else
								{
									System.out.print((c+2)+"");
									rc--;
								}
							}
							else 
							{
								System.out.print((j)+"");
							}
						}
						else
						{
							
							if(j>5)
							{
								if(j%2==1)
								{
									
									System.out.print((c)+"");
									cc--;
									
									
								}
								else
								{
									
									System.out.print(c+rc+"");
									rc++;
									cc--;
									
								
									
								}
							}
							else 
							{
								System.out.print((j)+"");
							}
						}
						
					}
					else 
					{
						System.out.print(j+"");
					}
						
					
				}
				cc+=2;
				
				System.out.println();
			}
			
	}
	public static void main(String[] args) {
		
		Q9_Pattern pt=new Q9_Pattern();
		pt.printPattern();
	}

}
