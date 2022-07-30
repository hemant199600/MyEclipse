package _Interface;

public class A2 extends A1 implements Second {

	int r;
	@Override
	public void setData(int a) {
		 r=a;
	}
	@Override
	public int getData() {
		
		return r;
	}

	
	
	public static void main(String args[])
	{
		A2 a=new A2();
		a.setData(a.input());
		int x=a.getData();
		a.setData(a.input());
		int y=a.getData();
		a.disp((x+y));
	}

}
