class Laptop
{
	String model;
	double price;
	void watch()
	{
		System.out.println("laptop model:"+model);
	}
	void type()
	{
		System.out.println("laptop price:"+price);
	}
}
public class Mainclass7
{
	public static void main(String[] args)
	{
		Laptop l1=new Laptop();
		l1.model="HP";
		l1.price=1.5;
		l1.watch();
		l1.type();
	}
}