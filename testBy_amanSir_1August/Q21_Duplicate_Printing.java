package testBy_amanSir_1August;

import java.util.Scanner;

public class Q21_Duplicate_Printing {

	public void find(String s)
	{
		char[] ch=s.toCharArray();
		int lock=-1;
		int[] count=new int[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			int c=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					c++;
					count[j]=lock;
				}
			}
			if(count[i]!=lock)
			{
				count[i]=c;
			}
		}
		System.out.println("Duplicate word: ");
		for(int i=0;i<count.length;i++)
		{
			if(count[i]>1)
			{
				System.out.print(ch[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string.");
		String s=sc.nextLine();
		Q21_Duplicate_Printing obj=new Q21_Duplicate_Printing();
		obj.find(s);
	}

}
