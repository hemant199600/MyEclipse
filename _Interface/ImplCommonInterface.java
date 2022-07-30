package _Interface;

public class ImplCommonInterface implements CommonIntreface {

	int arr1[],arr2[];
	@Override
	public void findAndDisplay() {
		System.out.print("Common Elemets are    : ");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.print(arr1[i]+" ");
				}
			}
		}
		System.out.println();
	}
	public void display()
	{
		System.out.print(" First Array Elements : ");
		for(int j=0;j<arr1.length;j++)
		{
			System.out.print(arr1[j]+" ");
		}
		System.out.println();
		System.out.print(" Second Array Elements: ");
		for(int j=0;j<arr2.length;j++)
		{
			System.out.print(arr2[j]+" ");
		}
		System.out.println();
	}

	@Override
	public void initialize() {
		arr1=new int[] {12,23,34,67,78,91,56};
		arr2=new int[] {39, 25, 15, 23, 55, 91, 66, 22};
	}
	public static void main(String args[])
	{
		ImplCommonInterface im=new ImplCommonInterface();
		im.initialize();
		im.display();
		im.findAndDisplay();
	}

}
