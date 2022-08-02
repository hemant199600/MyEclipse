package strings;
import java.util.Scanner;

public class Replace_ {

	Scanner sc=new Scanner(System.in);
	String b,a;
	public void replace(String s)
	{
		System.out.println("Enter String for replacement: ");
		b=sc.nextLine();
		System.out.println("Enter which String do you want to replace: ");
		a=sc.nextLine();
		System.out.println("After Replacing: "+(s.replace(a, b)));
		
	}
	public static void main(String[] args) {
		Replace_ rc=new Replace_();
		System.out.println("Enter String:");
		String str=rc.sc.nextLine();
		rc.replace(str);
	}

}
