package abstract_;

public class Main {
	public static void main(String[] args) {
		PerformOperations per=new PerformOperations();
		int ch;
		int c=1;
		do
		{
			System.out.println();
			per.menus();
			System.out.print("\tEnter Your choice:");
			ch=PerformOperations.sc.nextInt();
			switch(ch)
			{
			case 1:
			{
				per.add(per.input(), per.input());
				break;
			}
			case 2:
			{
				per.sub(per.input(), per.input());
				break;
			}
			case 3:
			{
				per.mult(per.input(), per.input());
				break;
			}
			case 4:
			{
				per.div(per.input(), per.input());
				break;
			}
			default:
			{
				System.out.println("\tInvalid choice.....?\n \tEnter Correct choice among option!");
				break;
			}
			}
			System.out.print("\n\tpress 1 for continue and press 0 for terminate: \n");
			if(per.input()==0)
			{
				c=0;
				System.out.println("\n\n\tBye bye buddy .....!");
			}
		}while(c!=0);
		
	}

}
