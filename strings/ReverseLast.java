package strings;

public class ReverseLast {

	public static void main(String[] args) {
		String s="My name is Hemant";
		System.out.println(s);
		String str[]=s.split(" ");
		char temp[];
		String s1="";
		for(int i=0;i<str.length;i++)
		{
			
			if(i==3)
			{
				
				temp=str[i].toCharArray();
				for(int j=temp.length-1;j>=0;j--)
				{
					s1+=temp[j];
				}
				str[i]=s1;
			}
			else
			{
				s1+=str[i]+" ";
			}
			
			
		}
		System.out.println(s1);
		

	}

}
