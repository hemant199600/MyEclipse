package strings;

public class _Character {

	public static void main(String[] args) {
		
		String str="Atul";
		String temp[]=str.split("");
		int i=0,count=0;
		if(str.contains(temp[0]))
		{
			count++;
			i++;
		}
		else
		{
			i++;
		}
		System.out.println(count);
	}

}
