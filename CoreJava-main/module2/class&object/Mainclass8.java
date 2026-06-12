class Biriyani
{
	String flavour;
	double price;
	void eat()
	{
		System.out.println("Biriyani flavour:"+flavour);
		}
	void taste()
	{
		System.out.println("Biriyani price:"+price);
	}
}
public class Mainclass8
{
	public static void main(String[] args)
	{
		Biriyani b1=new Biriyani();
		b1.flavour="Hyderabad biriyani";
		b1.price=250.0;
		b1.eat();
		b1.taste();
	}
}