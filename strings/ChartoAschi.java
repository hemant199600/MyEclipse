package strings;

public class ChartoAschi {

	public static void main(String[] args) {
		String s="Hemant";
		char[] a=s.toCharArray();
		System.out.println("By type casting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"\t"+(int)(a[i]));
		}
		System.out.println("By getByte() method:");
		byte c[]=s.getBytes();
		for(int i=0;i<c.length;i++)
		{
			System.out.println((char)c[i]+"\t"+c[i]);
		}
	}

}
