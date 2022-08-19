package strings;

public class Occur_Char_WithoutLoop {

	public static void main(String[] args) {
		
		String s="aman";
		String s1=s.replace("m", "");
		
		System.out.println("Occuerence of a :"+(s.length()-s1.length()));

	}

}
