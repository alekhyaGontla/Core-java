class Student
{
	Student()
	{
		System.out.println("Personal Detsails");
		System.out.println(" Academic Details");
	}
	Student(boolean b)
	{
		System.out.println("Personal Detsails");
		System.out.println(" Academic Details");
		System.out.println(" Experience Details");			
	}
}
public class Mainclass9
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		Student s2=new Student(true);
		
	}
}