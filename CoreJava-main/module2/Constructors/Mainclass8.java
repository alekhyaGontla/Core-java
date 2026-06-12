class Car
{
	Car(int a)
	{
		System.out.println("Petrol Engine");
	}
	Car(double d)
	{
		System.out.println("Diesel Engine");
	}
	Car(String s)
	{
		System.out.println("Electric Motor");
	}
}
public class Mainclass8
{
	public static void main(String[] args)
	{
		Car c1=new Car(10);
		Car c2=new Car(2.5);
		Car c3=new Car("ABC");
	}
}