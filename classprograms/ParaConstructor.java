package classprograms;

public class ParaConstructor 
{
	 int id,salary,age;
	 String name;
	public ParaConstructor( int i,int s,String  n,int a) 
	{
		id=i;
		name=n;
		salary=s;
		age=a;
	}
	public void display()
	{
		System.out.println();
		System.out.print(id+"\t|\t"+name+" \t|\t"+age+" \t|\t"+salary+" |");
	}
 
	public static void main(String[] args) {
		System.out.print("ID\t|\tName\t|\tAge\t|\tSalary|\n");
		System.out.print("-------------------------------------------------------");
		ParaConstructor p=new ParaConstructor(121,15000,"Anil",19);
		p.display();
		ParaConstructor p1=new ParaConstructor(122,18000,"Aniket",22);
		p1.display();
		ParaConstructor p2=new ParaConstructor(123,20000,"Amol",23);
		p2.display();
		ParaConstructor p3=new ParaConstructor(124,22000,"Akshay",19);
		p3.display();
		ParaConstructor p4=new ParaConstructor(125,50000,"Adarsh",20);
		p4.display();
		System.out.println();
		System.out.print("-------------------------------------------------------");


	}

}
