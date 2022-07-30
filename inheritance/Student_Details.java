package inheritance;

import java.util.Scanner;

class Student
{
	Scanner sc=new Scanner(System.in);
	String name,course;
	static String college="Sangamner college";
	int id,age;
		public void input()
		{
			System.out.print("Enter your name: ");
			name=sc.nextLine();
			System.out.print("Enter your  id: ");
			id=Integer.parseInt(course=sc.nextLine());
			System.out.print("Enter your course: ");
			course=sc.nextLine();
			System.out.print("Enter your age: ");
			age=sc.nextInt();
			System.out.println();
		}
}
class Detail extends Student
{
	public void print_Detail()
	{
		System.out.println("ID\t Name\tAge\tCourse\tCollege");
		System.out.println("-------------------------------------------");
		System.out.println(id+"\t"+name+"\t"+age+"\t"+course+"\t"+college);
	}
	
}

public class Student_Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Detail d=new Detail();
		d.input();
		d.print_Detail();

	}

}

