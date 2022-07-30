package strings;
import java.util.Scanner;
public class Fifth_Verticle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Input: ");
		String input=sc.nextLine();
		System.out.println("==================");
		for(int i=0;i<input.length();i++)
		{
			System.out.println(input.charAt(i));
		}
	}

}
