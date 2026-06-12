class Person
{
	int age;
	Person(int arg)
	{
		age=arg;
	}
}
public class Mainclass5
{
	public static void main(String[] args)
	{
		Person p1=new Person(25);
		System.out.println(p1.age);
		Person p2=new Person(22);
		System.out.println(p2.age);
		Person p3=new Person(45);
		System.out.println(p3.age);
	}
}