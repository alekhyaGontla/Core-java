class Car
{
	String name;
	double mileage;
	void drive()
	{
		System.out.println("driving :"+name);
	}
	void travel()
	{
		System.out.println("Travelling name:"+name+ "its mileage is"+mileage);
	}
}
public class Mainclass4
{
	public static void main(String[] args)
	{
		Car c1=new Car();
		c1.name="Alto";
		c1.mileage=18.5;
		c1.drive();
		c1.travel();
		System.out.println("----------------------------------------");
		Car c2=new Car();
		c2.name="quid";
		c2.mileage=16.5;
		c2.drive();
		c2.travel();
		System.out.println("----------------------------------------");
	}
}