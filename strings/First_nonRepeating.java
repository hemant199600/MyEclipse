package strings;

public class First_nonRepeating {

	public static void main(String[] args) {
		String s="codenera";
		String s1[]=s.split("");
		for(int i=0;i<s1.length;i++)
		{
			int j;
			for(j=i+1;j<s1.length;j++)
			{
				if((s1[i].equals(s1[j])==true)&&(i!=j))
				{
					break;
				}
				
			}
			if(j==s1.length)
			{
				System.out.println(s1[i]);
				break;
			}
		}

	}

}
