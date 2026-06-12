class Student
{
	String name;
	double cgpa;
	int yop;
	Student(String s,double d,int y)
	{
		name=s;
		cgpa=d;
		yop=y;
	}
}
public class Mainclass6
{
	public static void main(String[] args)
	{
		Student s1=new Student("Rama",8.9,2024);
		System.out.println(s1.name);
		System.out.println(s1.cgpa);
		System.out.println(s1.yop);
		
		Student s2=new Student("Krishna",8.5,2025);
		System.out.println(s2.name);
		System.out.println(s2.cgpa);
		System.out.println(s2.yop);
	}
}