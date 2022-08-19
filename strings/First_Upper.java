package strings;

public class First_Upper {

	public void convert(String s)
	{
		String str[]=s.split(" ");
		String temp=" ";
		for(int i=0;i<str.length;i++)
		{
			String ch[]=str[i].split("");
			for(int j=0;j<ch.length;j++)
			{
				if(j==0)
				{
					temp+=ch[j].toUpperCase();
				}
				else
				{
					temp+=ch[j];
				}
				
			}
			temp+=" ";
			str[i]=temp;
		}
		System.out.println("After converting: "+temp);
	}
	public static void main(String[] args) {
		First_Upper obj=new First_Upper();
		obj.convert("my name is hemant");

	}

}
