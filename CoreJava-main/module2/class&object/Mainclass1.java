class Student
{
	String name;
	int yop;
	double cgpa;
	void study()
	{
		System.out.println(name+" is studying the yop is:"+yop);
	}
	void write()
	{
		System.out.println(name+" is writing the cgpa is:"+cgpa);
	}
}
public class Mainclass1
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.name="Rama";
		s1.yop=2025;
		s1.cgpa=8.7;
		s1.study();
		s1.write();
		System.out.println("------------------------------------------");
		Student s2=new Student();
		s1.name="Krishna";
		s2.yop=2026;
		s2.cgpa=8.5;
		s2.study();
		s2.write();
		System.out.println("------------------------------------------");
		Student s3=new Student();
		s3.name="Seetha";
		s3.yop=2025;
		s3.cgpa=8.9;
		s3.study();
		s3.write();
		System.out.println("------------------------------------------");
		Student s4=new Student();
		s4.name="Hanuman";
		s4.yop=2026;
		s4.cgpa=8.8;
		s4.study();
		s4.write();
	}
}