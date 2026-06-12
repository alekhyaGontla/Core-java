class Mobile
{
	String model;
	double price;
	void call()
	{
		System.out.println("Calling in:"+model);
	}
	void message()
	{
		System.out.println("its price:"+price);
	}
}
public class Mainclass3
{
	public static void main(String[] args)
	{
		Mobile m1=new Mobile();
		m1.model="iphone pro max";
		m1.price=1.5;
		m1.call();
		m1.message();
		System.out.println("---------------");
		Mobile m2=new Mobile();
		m2.model="samsung pro max";
		m2.price=1.4;
		m2.call();
		m2.message();
		System.out.println("---------------");
	}
}
