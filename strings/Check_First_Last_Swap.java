package strings;
import java.util.Scanner;

public class Check_First_Last_Swap {

	public char[] check(String s)
	{
		char[]ch=s.toCharArray();
		if(ch[0]==ch[ch.length-1])
		{
			return ch;
		}
		else
		{
			char temp=ch[0];
			ch[0]=ch[ch.length-1];
			ch[ch.length-1]=temp;
			return ch;
		}
	}
	public void display(char[] ch)
	{
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Check_First_Last_Swap obj=new Check_First_Last_Swap();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sc.nextLine();
		System.out.print("Enterd String:");
		obj.display(str.toCharArray());
		System.out.print("After checking: ");
		char[] ch=obj.check(str);
		obj.display(ch);
		

	}

}
